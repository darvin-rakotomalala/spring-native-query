package com.poc.service.metier;

import com.poc.model.domain.Customer;
import com.poc.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerCUDSMImpl implements CustomerCUDSM {

    private final CustomerRepository customerRepository;

    @Override
    public void saveListCustomers(List<Customer> customers) {
        customerRepository.saveAll(customers);
    }

}
