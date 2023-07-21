package com.example.Java.Ticket.Project.entities.dtos;

import java.io.Serializable;

public record VenueDTO(String locationType,
                       int capacity
                       )  implements Serializable {}
