package com.example.Java.Ticket.Project.entities.dtos;

import java.io.Serializable;

public record OrderDTOpost(Long eventID,
                           Long ticketCategoryID,
                           int numberOfTickets) implements Serializable { }
