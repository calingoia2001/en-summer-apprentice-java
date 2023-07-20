package com.example.Java.Ticket.Project.service;

import com.example.Java.Ticket.Project.entities.Event;
import java.util.List;

public interface iEventService {
    List<Event> getEvent();
    void createEvent(Event event);
}
