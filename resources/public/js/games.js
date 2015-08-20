function centerWindow() {
    "use strict";
    var centeredWidth = $('.centered').width() / 2,
        centeredHeight = $('.centered').height() / 2;
    $('.centered').css({ 'margin-left' : -centeredWidth , 'margin-top' : -centeredHeight });
}

function requestData() {
    "use strict";
    var req = new XMLHttpRequest();
    req.open("GET", "/games", true);
    req.setRequestHeader("accept", "application/json");

    req.onload = function() {
        if (req.status >= 200 && req.status < 400){
            var gamesjson = req.responseText;
            var gamesData = JSON.parse(gamesjson);
            var gamesToHtml = "";
            var x = 0;

            for (var key in gamesData.games) {
                if (!gamesData.games.hasOwnProperty(key)) { 
                    continue; 
                }
                gamesToHtml += "<tr>";
                var gameurl = "/#" + gamesData.games[x].id;
                var threadurl = gamesData.games[x].url;
                gamesToHtml +=  '<td><a href="' + gameurl + '">' + gamesData.games[x].name + "</a></td>";
                gamesToHtml += '<td><a href="' + threadurl + '">' + threadurl + "</a></td>";
                gamesToHtml += "<td>" + '<button type="button" onclick="deleteGame(\'' + gamesData.games[x].id + '\');return false;" class="pure-button">Delete</button>' + "</td>";
                gamesToHtml += "</tr>";
                x++;
            }

            document.getElementById("games").innerHTML = gamesToHtml;
        } else {
            console.log("Error. Status code " + req.status);
        }
    };

    req.send(null);
    locationHashChanged();
}

function locationHashChanged() {
    "use strict";
    if (window.location.hash != "") {
        var id = "" + window.location.hash;
        id = id.slice(1, id.length);
        showGame(id);
    }
}

function showCreateGame() {
    "use strict";
    var createGame = document.getElementById("creategame");
    document.getElementById("index").className += ' hidden';
    createGame.className = createGame.className.replace( /(?:^|\s)hidden(?!\S)/g , '' );

    centerWindow();
}

function hideCreateGame() {
    "use strict";
    document.getElementById("creategame").className += ' hidden';
    document.getElementById("index").className =
    document.getElementById("index").className.replace
      ( /(?:^|\s)hidden(?!\S)/g , '' );
    window.location.hash = "";
}

function showGame(id) {
    "use strict";
    var req = new XMLHttpRequest();
    var url = "/game/" + id;
    req.open("GET", url, true);
    req.setRequestHeader("accept", "application/json");

    req.onload = function() {
        if (req.status >= 200 && req.status < 400){
            var gamejson = req.responseText;
            var gameData = JSON.parse(gamejson);
            var gameToHtml = "";

            document.getElementById("gameheader").innerHTML = gameData.game.name;
            
            gameToHtml += '<a href="' + gameData.game.url +'">' + gameData.game.url + "</a><br><br>";
            
            var hosts = [];
            
            for (var i = 0; i < gameData.hosts.length; i++) {
                hosts.push(gameData.hosts[i]);
            }
            
            gameToHtml += "<b>Hosts</b><br>" + hosts.join(', ');
            
            var players = [];

            for (var i = 0; i < gameData.players.length; i++) {
                players.push(gameData.players[i].name);
            }
            
            var playerLinks = [];
            
            for (var i = 0; i < gameData.players.length; i++) {
                playerLinks.push('<a href="#" onclick="deletePlayer(' + gameData.players[i].id + ');return false;">' + gameData.players[i].name + '</a>');
            }
            
            gameToHtml += "<br><br><b>Players</b><br>" + playerLinks.join(', ');
            
            gameToHtml += "<br>Click on a player to permanently remove him from the game! (reload the page to see the result)<br>";
            
            var nicknames = getNicknames();

            var currentDay = 0;
            
            if (gameData.votes.length > 0) {
                currentDay = gameData.votes[gameData.votes.length - 1].day;
        
                var targets = [];
            
                for (var i = 0; i < gameData.votes.length; i++) {
                    if (currentDay == gameData.votes[i].day) {
                        gameData.votes[i].target = gameData.votes[i].target.toLowerCase();
                        for (var key in nicknames) {
                            if (!nicknames.hasOwnProperty(key)) { 
                                continue; 
                            }
                            var nicknameslist = nicknames[key];
                            for (var j = 0; j < nicknameslist.length; j++) {
                                if (nicknameslist[j].toLowerCase() == gameData.votes[i].target.toLowerCase()) {
                                    // if a vote target equafls one of the nicknames, then change the vote to target the "real" name
                                    gameData.votes[i].target = key;
                                }
                                if (key.toLowerCase() == gameData.votes[i].target.toLowerCase()) {
                                    // if a vote target equals a name with the wrong capitalization, then change the vote to target the "real" name                                     // (if it's in the nicknames list)
                                    gameData.votes[i].target = key;
                                }
                            }
                        }
                        for (var j = 0; j < players.length; j++) {
                            if (players[j].toLowerCase() == gameData.votes[i].target.toLowerCase()) {
                                // if a vote target equals a name with the wrong capitalization, then change the vote to target the "real" name                                     // (if it's in the players list)
                                gameData.votes[i].target = players[j];
                            }
                        }
                        if (targets.indexOf(gameData.votes[i].target) == -1) {
                            // push every new unique vote target to the targets array
                            targets.push(gameData.votes[i].target);
                        }
                      }
                }
                
                for (var i = targets.length - 1; i >= 0; i--) {
                    if (targets[i] == "") {
                        // remove the null (unvote) target from the list of vote targets
                        targets.splice(i, 1);
                        break;
                    }
                }
                
                var voters = {}; // "voters" is a JavaScript object with targets as keys and their voters as values
                var activeVoters = {}; // "activeVoters" is a JavaScript object with targets as keys and ACTIVE (not unvoted) voters as values
                var nonvoters = players; // players who aren't voting for anyone at the current time
                
                for (var i = 0; i < gameData.votes.length; i++) {
                    if (currentDay = gameData.votes[i].day) {
                        for (var j = 0; j < targets.length; j++) {
                            if (gameData.votes[i].target.toLowerCase() == targets[j].toLowerCase()) {
                                if(voters.hasOwnProperty(targets[j]) || activeVoters.hasOwnProperty(targets[j])){
                                    continue;
                                }
                                // add a new key (property) to the object for every vote target during the current day
                                voters[targets[j]] = [];
                                activeVoters[targets[j]] = [];
                            }
                        }
                    }
                }
                
                for (var i = 0; i < gameData.votes.length; i++) {
                    if (currentDay == gameData.votes[i].day) {
                        for (var j = 0; j < targets.length; j++) {
                            var remainingVoters = activeVoters[targets[j]].slice(0);
                            for (var z = remainingVoters.length - 1; z >= 0; z--) {
                                if (remainingVoters[z] == gameData.votes[i].voter) {
                                    // every time a new vote is given, remove every previous vote from the active votes
                                    remainingVoters.splice(z, 1);
                                }
                            }
                            var markedVoters = voters[targets[j]].slice(0);
                            console.log(markedVoters);
                            for (var z = markedVoters.length - 1; z >= 0; z--) {
                                if (markedVoters[z] == gameData.votes[i].voter) {
                                    // every time a new vote is given, mark every previous vote with the mark "!" (unvoted) in the general votes
                                    markedVoters[z] = "!" + markedVoters[z];
                                }
                            }
                            activeVoters[targets[j]] = remainingVoters;
                            console.log(markedVoters);
                            voters[targets[j]] = markedVoters;
                            if (gameData.votes[i].target.toLowerCase() == targets[j].toLowerCase() && gameData.votes[j].target != "") {
                                // push every voter of the current day to the objects as a value of their vote target
                                voters[targets[j]].push(gameData.votes[i].voter);
                                activeVoters[targets[j]].push(gameData.votes[i].voter);
                            }
                        }
                    }
                }
                
                for (var i = 0; i < targets.length; i++) {
                    var activesList = activeVoters[targets[i]];
                    for (var j = 0; j < activesList.length; j++) {
                        for (var z = nonvoters.length - 1; z >= 0; z--) {
                            if (activesList[j] == nonvoters[z]) {
                                // remove every currently active voter from the "Not Voting" list
                                nonvoters.splice(z, 1);
                            }
                        }
                    }
                }
                
             //   var orderedWagonKeys = Object.keys(voters).sort(function(a,b){return activeVoters[b].length - activeVoters[a].length});
            //    var orderedWagons = {};
                
            //    for(var i = 0; i < orderedWagonKeys.length; i++){
            //        var key = orderedWagonKeys[i];
            //        orderedWagons[key] = voters[key];
            //    }
                
            //    console.log(orderedWagonKeys);
            //    console.log(orderedWagons);
                
                gameToHtml += "<br><h1>Day " + currentDay + " Votecount</h1>";
                        
                for (var i = 0; i < targets.length; i++) {
                    var mainVotersList = voters[targets[i]].slice(0);
                    for (var j = 0; j < mainVotersList.length; j++) {
                            if (mainVotersList[j].indexOf("!") != -1) {
                                var nameWithoutMark = mainVotersList[j].substring(1);
                                mainVotersList[j] = "<s>" + nameWithoutMark + "</s>";
                            }
                    }
                    
                    gameToHtml += "<br><b>" + targets[i] + " (" + activeVoters[targets[i]].length + "):</b> " + mainVotersList.join(', ');
            }
        
                gameToHtml += '<br><br><b>Not Voting (' + nonvoters.length + '):</b> ' + nonvoters.join(', ');
        }
            
            var firstNewDayVote = false;
            currentDay = 0;

            for (var i = 0; i < gameData.votes.length; i++) {
                var post = gameData.votes[i].index;
                var page = Math.floor(post/20) + 1;
                var address = gameData.game.url + "?page=" + page + "#" + post;

                if (currentDay != gameData.votes[i].day) {
                    firstNewDayVote = true;
                    currentDay = gameData.votes[i].day;
                }
                if (firstNewDayVote === true) {
                    gameToHtml += "<br><h1>Day " + gameData.votes[i].day + "</h1>";
                    firstNewDayVote = false;
                }
                if (gameData.votes[i].target == "") {
                    gameToHtml += '<br><a href="' + address + '">' + gameData.votes[i].voter + " unvoted</a>";
                } else if (gameData.votes[i].target == null) {
                    gameToHtml += '<br><a href="' + address + '">' + gameData.votes[i].voter + " gave an invalid vote!</a>";
                } else {
                    gameToHtml += '<br><a href="' + address + '">' + gameData.votes[i].voter + 
                        " voted for " + gameData.votes[i].target + "</a>";
                }
            }
            
            if (gameData.votes.length > 0) {
                gameToHtml += '<br><br><textarea id="reply_area" cols=80 rows=25 name="bericht" style="font:10pt Arial; margin-bottom: 4px; width:732px">';
                currentDay = gameData.votes[gameData.votes.length - 1].day;
            
                gameToHtml += "[blue][b][u][big]Day " + currentDay + " Votecount[/big][/u][/b][/blue]\r\n\r\n";
        
                for (var i = 0; i < targets.length; i++) {
                    var votersList = voters[targets[i]].slice(0);
                    for (var j = 0; j < votersList.length; j++) {
                            if (votersList[j].indexOf("!") != -1) {
                                var nameWithoutMark = votersList[j].substring(1);
                                votersList[j] = "[s]" + nameWithoutMark + "[/s]";
                            }
                    }
                    
                    gameToHtml += "[b]" + targets[i] + " (" + activeVoters[targets[i]].length + "):[/b] " + votersList.join(', ') + "\r\n";
            }
        
                gameToHtml += '\r\n' + '[b]Not Voting (' + nonvoters.length + '):[/b] ' + nonvoters.join(', ');
                gameToHtml += '</textarea>';
        }
            
            if (gameData.votes.length === 0) {
                gameToHtml += "<p>No votes have been extracted from the given thread yet (this may take more time or there may have been an error while reading the thread)</p>";
            }

            document.getElementById("gamedata").innerHTML = gameToHtml;
        } else {
            console.log("Error. Status code " + req.status);
        }
    };

    req.send(null);
    document.getElementById("index").className += ' hidden';
    document.getElementById("gameview").className =
    document.getElementById("gameview").className.replace
      ( /(?:^|\s)hidden(?!\S)/g , '' );
}

function deletePlayer(id) {
    "use strict";
    $.post("/delete-player", {id: id});
}

function deleteGame(id) {
    "use strict";
    $.post("/delete-game", {id: id});
}

function hideGame() {
    "use strict";
    document.getElementById("gameview").className += ' hidden';
    document.getElementById("index").className =
    document.getElementById("index").className.replace
      ( /(?:^|\s)hidden(?!\S)/g , '' );
    window.location.hash = "";
}

requestData();
