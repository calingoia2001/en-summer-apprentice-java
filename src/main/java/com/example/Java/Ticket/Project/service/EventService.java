package com.example.Java.Ticket.Project.service;

import com.example.Java.Ticket.Project.entities.Event;
import com.example.Java.Ticket.Project.entities.TicketCategory;
import com.example.Java.Ticket.Project.entities.Venue;
import com.example.Java.Ticket.Project.entities.dtos.EventDTO;
import com.example.Java.Ticket.Project.entities.dtos.TicketCategoryDTO;
import com.example.Java.Ticket.Project.entities.dtos.VenueDTO;
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
                convertToVenueDTO(event.getVenue()),
                event.getEventType().getEventTypeName(),
                event.getEventDescription(),
                event.getEventName(),
                event.getStartDate(),
                event.getEndDate()
                //convertToTicketCategoryDTOList()
        )).collect(Collectors.toList());
    }

    private VenueDTO convertToVenueDTO(Venue venue) {
        if (venue == null) {
            return null;
        }
        return new VenueDTO(
                venue.getVenueID(),
                venue.getLocationName(),
                venue.getLocationType(),
                venue.getCapacity()
        );
    }

    /*
    private List<TicketCategoryDTO> convertToTicketCategoryDTOList(List<TicketCategory> ticketCategories) {
        return ticketCategories.stream()
                .map(ticketCategory -> new TicketCategoryDTO(
                        ticketCategory.getTicketCategoryID(),
                        ticketCategory.getDescription(),
                        ticketCategory.getPrice()
                ))
                .collect(Collectors.toList());
    }*/

    @Override
    public void createEvent(Event event) {
        eventRepository.save(event);
    }
}
