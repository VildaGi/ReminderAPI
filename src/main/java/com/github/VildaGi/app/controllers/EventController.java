package com.github.VildaGi.app.controllers;

import com.github.VildaGi.app.service.EventService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {
    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/events")
    public String getEvents(){
        return eventService.getEvents();
    }

    @GetMapping("/add")
    public String addEvent(){
        eventService.addEvent();
        return "Successful";
    }
}
