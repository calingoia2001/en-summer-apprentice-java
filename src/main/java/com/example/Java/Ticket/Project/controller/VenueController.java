package com.example.Java.Ticket.Project.controller;

import com.example.Java.Ticket.Project.entities.Venue;
import com.example.Java.Ticket.Project.entities.dtos.VenueDTO;
import com.example.Java.Ticket.Project.service.VenueService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/venues")
@CrossOrigin()
public class VenueController {
    private final VenueService venueService;
    public VenueController(VenueService venueService) {
        this.venueService = venueService;
    }

    @GetMapping
    public List<VenueDTO> getVenue() {
        return venueService.getVenue();
    }

    @PostMapping
    public void createVenue(@RequestBody Venue venue) {
        venueService.createVenue(venue);
    }
}
