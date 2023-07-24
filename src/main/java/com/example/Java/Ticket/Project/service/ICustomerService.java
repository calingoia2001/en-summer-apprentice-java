package com.example.Java.Ticket.Project.service;

import com.example.Java.Ticket.Project.entities.Customer;
import java.util.List;
import java.util.Optional;

public interface ICustomerService {
    List<Customer> getCustomers();
    void createCustomer(Customer customer);
    void updateCustomer(Long customerID, Customer customer);
    void deleteCustomer(Long customerID);
}
