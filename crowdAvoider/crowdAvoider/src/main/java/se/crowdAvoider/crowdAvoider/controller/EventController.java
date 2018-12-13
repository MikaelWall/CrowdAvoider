package se.crowdAvoider.crowdAvoider.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import se.crowdAvoider.crowdAvoider.domain.Event;

import java.io.IOException;
import java.util.List;

@Controller
public class EventController {

    @PostMapping("/result")
    @ResponseBody
    public String updateEventDB(@RequestBody String jsonobj)throws IOException {
        System.out.println("Det här är objektet");
        System.out.println(jsonobj.toString());
//
//         ObjectMapper objectMapper = new ObjectMapper();
//
//        List<Event> listEvent = objectMapper.readValue(jsonobj, new TypeReference<List<Event>>(){});
//
//        for (Event event : listEvent) {
//            System.out.println(event.getAdress());
//        }

        return "index";
    }

}
