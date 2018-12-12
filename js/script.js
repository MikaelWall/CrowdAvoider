$(document).ready(function () {

                $(".readyBtn").click(function () {

                    var city = $("#cityselect option:selected").text();
                    console.log(city);

                    var date = $(".datumSelect").val();
                    console.log(date);

                    var eventList;

                    $.ajax({
                        type: "GET",
                        url: "https://app.ticketmaster.com/discovery/v2/events.json?size=100&apikey=n3CEf5CvEDPHCiKWf9blSDSGfqmglhsS&city=" + city, // + "&localDate=" + date,
                        async: true,
                        dataType: "json",
                        success: function (json) {
                            console.log(json);

                            for (let i = 0; i < (json._embedded.events).length; i++) {

                                if (date == (json._embedded.events[i].dates.start.localDate)) {
                                    console.log("Hittade resultat");
                                    eventList.push(json._embedded.events[i]);
                                    
                                }
                            }
                            
                            $.post("/result", JSON.stringify(eventList), function(){console.log("Hej")})

                        },
                        error: function (xhr, status, err) {
                        }
                    });
                });
            });