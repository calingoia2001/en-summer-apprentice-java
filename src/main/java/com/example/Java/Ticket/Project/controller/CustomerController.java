package com.example.Java.Ticket.Project.controller;

import com.example.Java.Ticket.Project.entities.Customer;
import com.example.Java.Ticket.Project.service.CustomerService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/customers")
@CrossOrigin()
public class CustomerController {
    private final CustomerService customerService;
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @PostMapping
    public void createCustomer(@RequestBody Customer customer) {
        customerService.createCustomer(customer);
    }

    @PutMapping(path = "{customerID}")
    public void updateCustomer(@PathVariable Long customerID,@RequestBody Customer customer) {
        customerService.updateCustomer(customerID, customer);
    }

    @DeleteMapping(path = "{customerID}")
    public void deleteCustomer(@PathVariable Long customerID) {
        customerService.deleteCustomer(customerID);
    }
}
