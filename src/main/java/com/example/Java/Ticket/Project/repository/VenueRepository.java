package com.example.Java.Ticket.Project.repository;

import com.example.Java.Ticket.Project.entities.Customer;
import com.example.Java.Ticket.Project.entities.Venue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VenueRepository extends JpaRepository<Venue, Long> {
}
