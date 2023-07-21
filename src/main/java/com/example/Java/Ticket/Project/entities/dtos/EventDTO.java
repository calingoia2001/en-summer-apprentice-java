package com.example.Java.Ticket.Project.entities.dtos;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public record EventDTO(Long id,
                       Long venue,
                       String type,
                       String description,
                       String name,
                       LocalDate startDate,
                       LocalDate endDate,
                       List<TicketCategoryDTO> ticketCategories) implements Serializable {}
