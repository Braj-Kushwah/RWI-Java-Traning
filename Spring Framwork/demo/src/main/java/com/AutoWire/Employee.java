package com.AutoWire;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    @Autowired
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Employee(Address address) {
        this.address = address;
    }
    public Employee(){
        super();
    }

    @Override
    public String toString() {
        return "Employee [address=" + address + "]";
    }
}