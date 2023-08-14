package com.poc.service.metier;

import com.poc.model.domain.Customer;

import java.util.List;

public interface CustomerCUDSM {
    void saveListCustomers(List<Customer> customers);
}
