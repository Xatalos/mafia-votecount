
function requestData() {
    "use strict";
    var req = new XMLHttpRequest();
    req.open("GET", "/games", false);
    req.setRequestHeader("accept", "application/json");
 
 
    req.onload = function() {
        if (req.status >= 200 && req.status < 400){
            var gamesjson = req.responseText;
            var gamesData = JSON.parse(gamesjson);
            var gamesToHtml = "";
            var key, x = 0;
            
            for (key in gamesData.games) {
                gamesToHtml += "<tr>";
                gamesToHtml += "<td>" + gamesData.games[x].gameid + "</td>";
                gamesToHtml += "<td>" + gamesData.games[x].name + "</td>";
                gamesToHtml += "<td>" + gamesData.games[x].address + "</td>";
                gamesToHtml += "<td>" + gamesData.games[x].currentDay + "</td>";
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