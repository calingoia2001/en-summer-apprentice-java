package com.example.Java.Ticket.Project.service;

import com.example.Java.Ticket.Project.entities.Event;
import com.example.Java.Ticket.Project.entities.dtos.EventDTO;

import java.util.List;

public interface IEventService {
    List<EventDTO> getEvents(/*Long venueID, String eventType*/);

    List<EventDTO> getEventsWithParams(Long venueID, String eventTypeName);

    List<Event> getAllEvent();

    void createEvent(Event event);
}
