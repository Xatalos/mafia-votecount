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
            var key, x = 0;

            for (key in gamesData.games) {
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
            
            var nicknames = {
                "27ninjabunnies": ["27nb", "nb", "ninja", "ninjabunnies"],
                "Alakaslam": ["slam"],
                "Artanis[Xp]": ["art", "artanis"],
                "batsnacks": ["bat", "bats"],
                "Bill Murray": ["bm", "bill", "murray"],
                "Blazinghand": ["bh"],
                "boxerfred": ["bf"],
                "Chezinu": ["chez"],
                "Clarity_nl": ["clarity"],
                "Damdred": ["damd", "damdy"],
                "EdgarAllanPoE": ["edgar", "poe", "edgarallenpoe"],
                "Fecalfeast": ["ff", "fecal"],
                "FirmTofu": ["ft", "firm", "tofu"],
                "GlowingBear": ["gb", "glowing", "bear"],
                "Half the Sky": ["hts"],
                "Hapahauli": ["hapa"],
                "Holyflare": ["hf"],
                "justanothertownie": ["jat"],
                "Keirathi": ["kei", "keir"],
                "LightningStrike": ["ls", "lightning"],
                "marvellosity": ["marv", "marvy", "marvel", "marvelocity", "marshmallow"],
                "Oatsmaster": ["oat", "oats"],
                "ObiWanShinobi": ["ows", "obi", "obiwan", "shinobi"],
                "raynpelikoneet": ["ray", "rayn", "raypelikoneet"],
                "rsoultin": ["rs", "rsou", "rsoul"],
                "sandroba": ["sand", "roba"],
                "[UoN]Sentinel": ["sent", "sentinel"],
                "scott31337": ["scott"],
                "Stutters695": ["stutters"],
                "The Shining": ["shining"],
                "VayneAuthority": ["va", "vayne"],
                "VisceraEyes": ["ve", "viscera"],
                "WaveofShadow": ["wos", "wave"],
                "Xatalos": ["xat", "xata"],
                "yamato77": ["yam", "yama", "yamato"]
            };

            var currentDay = 0;
            
            if (gameData.votes.length > 0) {
                currentDay = gameData.votes[gameData.votes.length - 1].day;
            
                gameToHtml += "<br><h1>Day " + currentDay + " Votecount</h1>";
        
                var targets = [];
                var nonvoters = players;
            
                for (var i = 0; i < gameData.votes.length; i++) {
                    if (currentDay == gameData.votes[i].day) {
                        for (var key in nicknames) {
                            if (!nicknames.hasOwnProperty(key)) { 
                                continue; 
                            }
                            var nicknameslist = nicknames[key];
                            for (var z = 0; z < nicknameslist.length; z++) {
                                if (nicknameslist[z].toLowerCase() == gameData.votes[i].target.toLowerCase()) {
                                    // if a given vote target equals one of the nicknames, then change the vote to target the "real" name
                                    gameData.votes[i].target = key;
                                }
                            }
                        }
                        if (targets.indexOf(gameData.votes[i].target.toLowerCase()) == -1) {
                            // push every new unique vote target to the targets array
                            targets.push(gameData.votes[i].target.toLowerCase());
                        }
                      }
                }
                        
                for (var i = 0; i < targets.length; i++) {
                    if (targets[i] == "") {
                        // don't show the null (unvote) target in the targets listing
                        continue;
                    }
                    var voters = [];
                    for (var j = 0; j < gameData.votes.length; j++) {
                        if (currentDay == gameData.votes[j].day) {
                            for (var k = 0; k < targets.length; k++) {
                                for (var z = 0; z < voters.length; z++) {
                                    if (voters[z] == gameData.votes[j].voter) {
                                        // every time a new vote is given, mark every previous vote by the same voter as "overwritten"
                                        voters[z] = "<s>" + voters[z] + "</s>";
                                    }
                                }
                            }
                        }
                        if (currentDay == gameData.votes[j].day && gameData.votes[j].target.toLowerCase() == targets[i].toLowerCase() && gameData.votes[j].target != "") {
                            // add a new voter to an existing vote target
                            voters.push(gameData.votes[j].voter);
                        }
                    }
                    var voterscount = 0;
                    for (var j = 0; j < voters.length; j++) {
                        if (voters[j].indexOf("<s>") == -1) {
                            // count the number of voters for this target that haven't been unvoted
                            voterscount++;
                            
                            for (var z = nonvoters.length - 1; z >= 0; z--) {
                                if (nonvoters[z].toLowerCase() == voters[j].toLowerCase()) {
                                    nonvoters.splice(z,1);
                                }
                            } 
                        }
                    }
                    
                    var targetname = targets[i];
                    
                    for (var z = 0; z < players.length; z++) {
                        if (players[z].toLowerCase() == targets[i].toLowerCase()) {
                            targetname = players[z];
                        }
                    }
                    
                    gameToHtml += "<br><b>" + targetname + " (" + voterscount + "):</b> " + voters.join(', ');
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
        
                var targets = [];
                var nonvoters = players;
            
                for (var i = 0; i < gameData.votes.length; i++) {
                    if (currentDay == gameData.votes[i].day) {
                        if (targets.indexOf(gameData.votes[i].target.toLowerCase()) == -1) {
                            // push every new unique vote target to the targets array
                            targets.push(gameData.votes[i].target.toLowerCase());
                        }
                      }
                }
                        
                for (var i = 0; i < targets.length; i++) {
                    if (targets[i] == "") {
                        // don't show the null (unvote) target in the targets listing
                        continue;
                    }
                    var voters = [];
                    for (var j = 0; j < gameData.votes.length; j++) {
                        if (currentDay == gameData.votes[j].day) {
                            for (var k = 0; k < targets.length; k++) {
                                for (var z = 0; z < voters.length; z++) {
                                    if (voters[z] == gameData.votes[j].voter) {
                                        // every time a new vote is given, mark every previous vote by the same voter as "overwritten"
                                        voters[z] = "[s]" + voters[z] + "[/s]";
                                    }
                                }
                            }
                        }
                        if (currentDay == gameData.votes[j].day && gameData.votes[j].target.toLowerCase() == targets[i].toLowerCase() && gameData.votes[j].target != "") {
                            // add a new voter to an existing vote target
                            voters.push(gameData.votes[j].voter);
                        }
                    }
                    var voterscount = 0;
                    for (var j = 0; j < voters.length; j++) {
                        if (voters[j].indexOf("[s]") == -1) {
                            // count the number of voters for this target that haven't been unvoted
                            voterscount++;
                            
                            for (var z = nonvoters.length - 1; z >= 0; z--) {
                                if (nonvoters[z].toLowerCase() == voters[j].toLowerCase()) {
                                    nonvoters.splice(z,1);
                                }
                            }
                        }
                    }
                    
                    var targetname = targets[i];
                    
                    for (var z = 0; z < players.length; z++) {
                        if (players[z].toLowerCase() == targets[i].toLowerCase()) {
                            targetname = players[z];
                        }
                    }
                    
                    gameToHtml += "[b]" + targetname + " (" + voterscount + "):[/b] " + voters.join(', ') + "\r\n";
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
