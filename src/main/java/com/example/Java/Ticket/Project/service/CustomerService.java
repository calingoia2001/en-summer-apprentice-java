package com.example.Java.Ticket.Project.service;

import com.example.Java.Ticket.Project.entities.Customer;
import com.example.Java.Ticket.Project.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }
}
