package com.poc.service.applicatif;

import com.poc.model.dto.CustomerDTO;

import java.util.List;

public interface CustomerCUDSA {
    void saveListCustomers(List<CustomerDTO> customers);
}
