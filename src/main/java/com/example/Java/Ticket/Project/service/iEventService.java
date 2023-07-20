package com.example.Java.Ticket.Project.service;

import com.example.Java.Ticket.Project.entities.Event;
import com.example.Java.Ticket.Project.entities.Orders;

import java.util.List;

public interface iEventService {
    List<Event> getEvent();
    void createEvent(Event event);
}
