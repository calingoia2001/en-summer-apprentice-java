package com.example.Java.Ticket.Project.service;

import com.example.Java.Ticket.Project.entities.EventType;
import com.example.Java.Ticket.Project.repository.EventTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventTypeService implements IEventTypeService {
    private final EventTypeRepository eventTypeRepository;

    public EventTypeService(EventTypeRepository eventTypeRepository) {
        this.eventTypeRepository = eventTypeRepository;
    }

    @Override
    public List<EventType> getEventType() {
        return eventTypeRepository.findAll();
    }

    @Override
    public void createEventType(EventType eventType) {
        eventTypeRepository.save(eventType);
    }
}
