package com.example.Java.Ticket.Project.controller;

import com.example.Java.Ticket.Project.entities.Orders;
import com.example.Java.Ticket.Project.entities.dtos.OrdersDTO;
import com.example.Java.Ticket.Project.service.OrdersService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/orders")
public class OrdersController {
    private final OrdersService ordersService;
    public OrdersController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

    @GetMapping
    public List<OrdersDTO> getOrders() {
        return ordersService.getOrders();
    }

    @PostMapping
    public void createOrder(@RequestBody Orders order) {
        ordersService.createOrders(order);
    }
}
