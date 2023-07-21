package com.example.Java.Ticket.Project.controller;

import com.example.Java.Ticket.Project.entities.EventType;
import com.example.Java.Ticket.Project.service.EventTypeService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/eventTypes")
public class EventTypeController {
    private final EventTypeService eventTypeService;

    public EventTypeController(EventTypeService eventTypeService) {
        this.eventTypeService = eventTypeService;
    }

    @GetMapping
    public List<EventType> getEventType() {
        return eventTypeService.getEventType();
    }

    @PostMapping
    public void createEventType(@RequestBody EventType eventType) {
        eventTypeService.createEventType(eventType);
    }
}
