function centerWindow() {
    "use strict";
    var centeredWidth = $('.centered').width()/2, 
    centeredHeight = $('.centered').height()/2;
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
                gamesToHtml += "<td>" + gamesData.games[x].name + "</td>";
                gamesToHtml += "<td>" + gamesData.games[x].url + "</td>";
                gamesToHtml += "<td>" + gamesData.games[x].start_date + "</td>";
                gamesToHtml += "</tr>";
                x++;
            }
            
            document.getElementById("games").innerHTML = gamesToHtml;
            // Success!
        } else {
            console.log("Error. Status code " + req.status);
            // We reached our target server, but it returned an error
 
        }
    };
    req.send(null);
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
}

requestData();
centerWindow();