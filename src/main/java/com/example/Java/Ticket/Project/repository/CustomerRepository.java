package com.example.Java.Ticket.Project.repository;

import com.example.Java.Ticket.Project.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
