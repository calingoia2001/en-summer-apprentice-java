package com.example.Java.Ticket.Project.entities.dtos;

import java.io.Serializable;
import java.time.LocalDate;

public record OrderDTO(Long eventID,
                       LocalDate orderedAt,
                       Long ticketCategoryID,
                       int numberOfTickets,
                       int totalPrice) implements Serializable {}
