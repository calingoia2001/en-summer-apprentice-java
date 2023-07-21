package com.example.Java.Ticket.Project.entities.dtos;

import java.io.Serializable;
import java.util.Date;

public record OrdersDTO(Long orderID,
                        Long eventID,
                        TicketCategoryDTO ticketCategoryID,
                        Date orderedAt,
                        int numberOfTickets,
                        int totalPrice) implements Serializable {}
