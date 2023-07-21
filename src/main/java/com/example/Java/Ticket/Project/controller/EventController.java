package com.example.Java.Ticket.Project.controller;

import com.example.Java.Ticket.Project.entities.Event;
import com.example.Java.Ticket.Project.entities.dtos.EventDTO;
import com.example.Java.Ticket.Project.service.EventService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/events")
public class EventController {
    private final EventService eventService;
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping()
    public List<EventDTO> getEvents() {
        return eventService.getEvents();
    }

    @PostMapping
    public void createEvent(@RequestBody Event event) {
        eventService.createEvent(event);
    }
}
