package com.example.Java.Ticket.Project.entities.dtos;

import java.io.Serializable;

public record VenueDTO(Long id,
                       String locationName,
                       String locationType,
                       int capacity
                       )  implements Serializable {}
