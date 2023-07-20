package com.example.Java.Ticket.Project.repository;

import com.example.Java.Ticket.Project.entities.TicketCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketCategoryRepository extends JpaRepository<TicketCategory, Long> {
}
