package com.example.Java.Ticket.Project.service;

import com.example.Java.Ticket.Project.entities.Event;
import com.example.Java.Ticket.Project.entities.TicketCategory;
import com.example.Java.Ticket.Project.entities.dtos.EventDTO;
import com.example.Java.Ticket.Project.entities.dtos.TicketCategoryDTO;
import com.example.Java.Ticket.Project.repository.EventRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EventService implements iEventService {
    private final EventRepository eventRepository;
    public EventService(EventRepository eventRepository) { this.eventRepository = eventRepository; }

    @Override
    public List<EventDTO> getEvent() {
        return eventRepository.findAll().stream().map(event -> new EventDTO(
                event.getEventID(),
                event.getVenue().getVenueID(),   // convertToVenueDTO(event.getVenue()),
                event.getEventType().getEventTypeName(),
                event.getEventDescription(),
                event.getEventName(),
                event.getStartDate(),
                event.getEndDate(),
                convertToTicketCategoryDTOList(event.getTicketCategories())
        )).collect(Collectors.toList());
    }

    private List<TicketCategoryDTO> convertToTicketCategoryDTOList(List<TicketCategory> ticketCategories) {
        return ticketCategories.stream()
                .map(ticketCategory -> new TicketCategoryDTO(
                        ticketCategory.getTicketCategoryID(),
                        ticketCategory.getDescription(),
                        ticketCategory.getPrice()
                ))
                .collect(Collectors.toList());
    }

    @Override
    public void createEvent(Event event) {
        eventRepository.save(event);
    }
}
