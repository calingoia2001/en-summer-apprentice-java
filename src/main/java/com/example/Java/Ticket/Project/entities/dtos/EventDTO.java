package com.example.Java.Ticket.Project.entities.dtos;

import com.example.Java.Ticket.Project.entities.Event;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public record EventDTO(Long eventID,
                       VenueDTO venue,
                       String type,
                       String description,
                       String name,
                       Date startDate,
                       Date endDate
                       /*List<TicketCategoryDTO> ticketCategories*/) implements Serializable {}
