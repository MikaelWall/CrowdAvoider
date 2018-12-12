package se.crowdAvoider.crowdAvoider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class EventController {

    @PostMapping("/result")
    @ResponseBody
    public String updateEventDB(@RequestBody String jsonobj){
        System.out.println("Det här är objektet");
        System.out.println(jsonobj);
        return "index";
    }

}
