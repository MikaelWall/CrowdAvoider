$(document).ready(function () {

    $(".readyBtn").click(function () {

        var city = $("#cityselect option:selected").text();


        var date = $(".datumSelect").val();




        $.ajax({
            type: "GET",
            url: "https://app.ticketmaster.com/discovery/v2/events.json?size=100&apikey=n3CEf5CvEDPHCiKWf9blSDSGfqmglhsS&city=" + city, // + "&localDate=" + date,
            async: true,
            dataType: "json",
            headers: {
                'Content-Type': 'application/json',
                'Accept': 'application/json'
            },
           
            success: function (json) {
                console.log(json);
                let eventList = [];
                for (let i = 0; i < (json._embedded.events).length; i++) {
                    let oneEvent = {};
                    if (date == (json._embedded.events[i].dates.start.localDate)) {
                        
                         oneEvent = {
                            name:json._embedded.events[i].name,
                            adress:json._embedded.events[i]._embedded.venues[0].address.line1,
                            date:json._embedded.events[i].dates.start.localDate
                        }
                        console.log("det här är objektet")
                        console.log(oneEvent);
                        eventList.push(oneEvent);

                    }

                }
                console.log("Det här är eventList");
                console.log(eventList);
               
               // $.post("/result", JSON.stringify({eventList}),  function(){console.log("Hej")})
               $.ajax({
                url:"/result",
                type:"POST",
                data:JSON.stringify({eventList}),
                contentType:"application/json; charset=utf-8",
                dataType:"json",
                success: function(){
                  console.log("hej")
                }
              })

            },
            error: function (xhr, status, err) {}
        });
    });
});