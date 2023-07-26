package com.example.Java.Ticket.Project.controller;

import com.example.Java.Ticket.Project.entities.Order;
import com.example.Java.Ticket.Project.entities.dtos.OrderDTO;
import com.example.Java.Ticket.Project.entities.dtos.OrderDTOpost;
import com.example.Java.Ticket.Project.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1/orders")
public class OrderController {
    private final OrderService ordersService;
    public OrderController(OrderService ordersService) {
        this.ordersService = ordersService;
    }

    @GetMapping
    public List<OrderDTO> getOrders(@RequestParam Long customerID) {
        return ordersService.getOrders(customerID);
    }

    /*@PostMapping
    public void createOrder(@RequestBody Order order) {
       ordersService.createOrders(order);
    }*/

    @PostMapping
    public ResponseEntity<?> createOrder(@RequestBody OrderDTOpost orderDTOpost) {
        long customerID = orderDTOpost.customerID();
        long eventID = orderDTOpost.eventID();
        long ticketCategoryID = orderDTOpost.ticketCategoryID();
        int numberOfTickets = orderDTOpost.numberOfTickets();

        Optional<Order> orderOptional = ordersService.createOrder(customerID, eventID, ticketCategoryID, numberOfTickets);

        if (orderOptional.isEmpty()) {
            Error error = new Error("Order could not be added, customer or ticket category not found");
            return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
        } else {
            Order order = orderOptional.get();
            OrderDTO orderDTO = new OrderDTO(
                    order.getTicketCategory().getEventID().getEventID(),
                    order.getOrderedAt(),
                    order.getTicketCategory().getTicketCategoryID(),
                    order.getNumberOfTickets(),
                    order.getTotalPrice()
            );
            return new ResponseEntity<>(orderDTO, HttpStatus.OK);
        }
    }

}
