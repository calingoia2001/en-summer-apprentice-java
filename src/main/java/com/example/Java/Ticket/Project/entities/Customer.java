package com.example.Java.Ticket.Project.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "CUSTOMER")
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long customerID;

    @Column( name = "customerName" )
    private String customerName;

    @Column ( unique = true )
    private String email;

    public Customer() {}
    public Customer(Long customerID, String customerName, String email) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.email = email;
    }

    public Long getCustomerID() {
        return customerID;
    }
    public void setCustomerID(Long customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(customerID, customer.customerID) && Objects.equals(customerName, customer.customerName) && Objects.equals(email, customer.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerID, customerName, email);
    }
}
