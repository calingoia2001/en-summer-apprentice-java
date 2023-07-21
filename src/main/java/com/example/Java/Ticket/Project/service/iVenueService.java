package com.example.Java.Ticket.Project.service;

import com.example.Java.Ticket.Project.entities.Venue;
import com.example.Java.Ticket.Project.entities.dtos.VenueDTO;

import java.util.List;

public interface iVenueService {
    List<VenueDTO> getVenue();
    void createVenue(Venue venue);
}
