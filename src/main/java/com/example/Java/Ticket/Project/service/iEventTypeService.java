package com.example.Java.Ticket.Project.service;

import com.example.Java.Ticket.Project.entities.Customer;
import com.example.Java.Ticket.Project.entities.EventType;

import java.util.List;

public interface iEventTypeService {
    List<EventType> getEventType();
    void createEventType (EventType eventType);
}
