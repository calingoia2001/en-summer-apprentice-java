package com.example.Java.Ticket.Project.repository;

import com.example.Java.Ticket.Project.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> { }
