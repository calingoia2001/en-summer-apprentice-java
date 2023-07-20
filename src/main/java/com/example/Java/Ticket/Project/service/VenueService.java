package com.example.Java.Ticket.Project.service;

import com.example.Java.Ticket.Project.entities.Venue;
import com.example.Java.Ticket.Project.repository.VenueRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VenueService implements iVenueService {
    private final VenueRepository venueRepository;

    public VenueService(VenueRepository venueRepository) {
        this.venueRepository = venueRepository;
    }

    @Override
    public List<Venue> getVenue() {
        return venueRepository.findAll();
    }

    @Override
    public void createVenue(Venue venue) {
        venueRepository.save(venue);
    }
}
