package com.example.Java.Ticket.Project.service;

import com.example.Java.Ticket.Project.entities.Venue;
import com.example.Java.Ticket.Project.entities.dtos.VenueDTO;
import com.example.Java.Ticket.Project.repository.VenueRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VenueService implements iVenueService {
    private final VenueRepository venueRepository;

    public VenueService(VenueRepository venueRepository) {
        this.venueRepository = venueRepository;
    }

    @Override
    public List<VenueDTO> getVenue() {
        return venueRepository.findAll().stream().map(venue -> new VenueDTO(
                venue.getLocationType(),
                venue.getCapacity()
        )).collect(Collectors.toList());
    }

    @Override
    public void createVenue(Venue venue) {
        venueRepository.save(venue);
    }
}
