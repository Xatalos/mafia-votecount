
function requestData() {
    var req = new XMLHttpRequest();
    req.open("GET", "/games", false);
    req.setRequestHeader("accept", "application/json");
 
 
    req.onload = function() {
        if (req.status >= 200 && req.status < 400){
            var gamesjson = req.responseText;
            console.log(gamesjson);
 
            var gamesobj = JSON.parse(gamesjson);
            var gamestohtml = "";
            var key, count = 0;
            for(key in gamesobj.games) {
                if(gamesobj.games.hasOwnProperty(key)) {
                    count++;
                }
            }
            for (var i = 0; i < count; i++) {
                gamestohtml += "<tr>";
                gamestohtml += "<td>" + gamesobj.games[i].gameid + "</td>";
                gamestohtml += "<td>" + gamesobj.games[i].name + "</td>";
                gamestohtml += "<td>" + gamesobj.games[i].address + "</td>";
                gamestohtml += "<td>" + gamesobj.games[i].currentDay + "</td>";
                gamestohtml += "</tr>";
            }
            document.getElementById("games").innerHTML = gamestohtml;
            // Success!
            } else {
                console.log("Error. Status code " + req.status);
                // We reached our target server, but it returned an error
 
            }
    };
    req.send(null);
}