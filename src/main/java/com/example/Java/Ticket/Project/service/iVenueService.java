package com.example.Java.Ticket.Project.service;

import com.example.Java.Ticket.Project.entities.Venue;

import java.util.List;

public interface iVenueService {
    List<Venue> getVenue();
    void createVenue(Venue venue);
}
