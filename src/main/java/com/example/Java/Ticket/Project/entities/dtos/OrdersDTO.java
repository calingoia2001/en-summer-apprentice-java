package com.example.Java.Ticket.Project.entities.dtos;

import java.io.Serializable;
import java.util.Date;

public record OrdersDTO(Long eventID,
                        Date orderedAt,
                        Long ticketCategoryID,
                        int numberOfTickets,
                        int totalPrice) implements Serializable {}
