package com.example.Java.Ticket.Project.repository;

import com.example.Java.Ticket.Project.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {}
