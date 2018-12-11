$(document).ready(function () {
    $(".readyBtn").click(function () {
        
       var city = $("#cityselect option:selected").text();
       console.log(city);
        
        $.ajax({
            type:"GET",
            url:"https://app.ticketmaster.com/discovery/v2/events.json?size=1&apikey=n3CEf5CvEDPHCiKWf9blSDSGfqmglhsS&city=" + city,
            async:true,
            dataType: "json",
            success: function(json) {
                        console.log(json);
                        // Parse the response.
                        // Do other things.
                     },
            error: function(xhr, status, err) {
                        // This time, we do not end up here!
                     }
          });
    });
});


//$(".text").html(data.quote); 
  //              $(".author").html(data.author);
