package com.example.Java.Ticket.Project.repository;

import com.example.Java.Ticket.Project.entities.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders, Long> {}
