package com.example.Java.Ticket.Project.entities.dtos;

import java.io.Serializable;

public record TicketCategoryDTO(Long id,
                                String description,
                                int price)  implements Serializable {}
