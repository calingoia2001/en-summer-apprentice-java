package com.example.Java.Ticket.Project.controller;

import com.example.Java.Ticket.Project.entities.Customer;
import com.example.Java.Ticket.Project.repository.CustomerRepository;
import com.example.Java.Ticket.Project.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/customers")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }
}
