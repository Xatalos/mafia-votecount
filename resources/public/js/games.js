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
                var url = "/#" + gamesData.games[x].id;
                gamesToHtml +=  '<td><a href="' + url + '">' + gamesData.games[x].name + "</a></td>";
                gamesToHtml += "<td>" + gamesData.games[x].url + "</td>";
                gamesToHtml += "<td>" + gamesData.games[x].start_date + "</td>";
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
    document.getElementById("index").className += ' hidden';
    document.getElementById("creategame").className =
    document.getElementById("creategame").className.replace
      ( /(?:^|\s)hidden(?!\S)/g , '' );
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
//                  table :vote    ---> votes!!!
//                  (integer :day :not-null) - äänestyspäivä
//                  (integer :index :not-null) - viestin numero #
//                  (varchar :voter 40 :not-null) - äänestäjä
//                  (varchar :target 40)))) - äänestyksen kohde
    "use strict";
    var req = new XMLHttpRequest();
    var address = "/game/" + id;
    req.open("GET", address, true);
    req.setRequestHeader("accept", "application/json");

    req.onload = function() {
        if (req.status >= 200 && req.status < 400){
            var gamejson = req.responseText;
            var gameData = JSON.parse(gamejson);
            var gameToHtml = "";
            var key, x = 0;

            document.getElementById("gameheader").innerHTML = gameData.game.name;

            for (key in gameData.players) {
                gameToHtml += "<li>" + gameData.players[x].name + "</li>";
                x++;
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

function hideGame() {
    "use strict";
    document.getElementById("gameview").className += ' hidden';
    document.getElementById("index").className =
    document.getElementById("index").className.replace
      ( /(?:^|\s)hidden(?!\S)/g , '' );
    window.location.hash = "";
}

requestData();
centerWindow();
