package com.example.Java.Ticket.Project.controller;

import com.example.Java.Ticket.Project.entities.Order;
import com.example.Java.Ticket.Project.entities.dtos.OrderDTO;
import com.example.Java.Ticket.Project.service.OrderService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/orders")
public class OrderController {
    private final OrderService ordersService;
    public OrderController(OrderService ordersService) {
        this.ordersService = ordersService;
    }

    @GetMapping
    public List<OrderDTO> getOrders() {
        return ordersService.getOrders();
    }

    @PostMapping
    public void createOrder(@RequestBody Order order) {
        ordersService.createOrders(order);
    }
}
