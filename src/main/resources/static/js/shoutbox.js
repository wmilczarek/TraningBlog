
$( document ).ready(getShouts());

function getShouts () {
    jQuery.ajax({
        type: "GET",
        url: "http://localhost:8090/home/shouts",
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        success: function (data, status, jqXHR) {
            displayData(data);
        },
        error: function (jqXHR, status) {
            // error handler
            alert("failed");
        }
    })};

function displayData(data){
    var output="<ul>";
    for (var i in data) {
        output+="<li>" + data[i].id + " " + data[i].approved + "--" + data[i].isActive + "-- " + data[i].shoutComment + "</li>";
    }
    output+="</ul>";
    document.getElementById("shoutbox").innerHTML=output;
}
