package se.crowdAvoider.crowdAvoider.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import se.crowdAvoider.crowdAvoider.domain.Event;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class EventController {
    List<Event> events = new ArrayList<>();

    @PostMapping("/result")
    public String updateEventDB(@RequestBody String jsonobj, Model model) throws IOException {

        System.out.println("Det här är objektet");
        System.out.println(jsonobj.toString());


        ObjectMapper objectMapper = new ObjectMapper();
        Event event = objectMapper.readValue(jsonobj, Event.class);
        events.add(event);

        model.addAttribute("events", events);
        return "result";
    }

}
