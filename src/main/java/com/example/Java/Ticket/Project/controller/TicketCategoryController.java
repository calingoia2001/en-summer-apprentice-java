package com.example.Java.Ticket.Project.controller;

import com.example.Java.Ticket.Project.entities.TicketCategory;
import com.example.Java.Ticket.Project.service.TicketCategoryService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/ticketcategory")
public class TicketCategoryController {
    private final TicketCategoryService ticketCategoryService;
    public TicketCategoryController(TicketCategoryService ticketCategoryService) {
        this.ticketCategoryService = ticketCategoryService;
    }

    @GetMapping
    public List<TicketCategory> getTicketCategory() {
        return ticketCategoryService.getTicketCategory();
    }

    @PostMapping
    public void createCustomer(@RequestBody TicketCategory ticketCategory) {
        ticketCategoryService.createTicketCategory(ticketCategory);
    }
}
