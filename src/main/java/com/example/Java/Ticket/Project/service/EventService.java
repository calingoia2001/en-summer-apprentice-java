package com.example.Java.Ticket.Project.service;

import com.example.Java.Ticket.Project.entities.Customer;
import com.example.Java.Ticket.Project.entities.Event;
import com.example.Java.Ticket.Project.repository.EventRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EventService implements iEventService {
    private final EventRepository eventRepository;
    public EventService(EventRepository eventRepository) { this.eventRepository = eventRepository; }

    @Override
    public List<Event> getEvent() {
        return eventRepository.findAll();
    }

    @Override
    public void createEvent(Event event) {
        eventRepository.save(event);
    }

}
