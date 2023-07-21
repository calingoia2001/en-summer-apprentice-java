package com.example.Java.Ticket.Project.entities.dtos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public record EventDTO(Long id,
                       Long venue,
                       String type,
                       String description,
                       String name,
                       Date startDate,
                       Date endDate,
                       List<TicketCategoryDTO> ticketCategories) implements Serializable {}
