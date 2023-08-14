package com.poc.service.metier;

import com.poc.model.domain.Customer;
import com.poc.model.domain.view.CustomerView;
import com.poc.model.domain.view.ProjectionView;
import com.poc.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class CustomerRSMImpl implements CustomerRSM {

    private final CustomerRepository customerRepository;

    @Override
    public List<Customer> getByGradeNative() {
        return customerRepository.findByGradeNative();
    }

    @Override
    public List<CustomerView> getGroupByCityAndMaxGrade() {
        return customerRepository.findGroupByCityAndMaxGrade();
    }

    @Override
    public List<ProjectionView> getCustomerGroupByCityAndMaxGrade() {
        return customerRepository.findCustomerGroupByCityAndMaxGrade();
    }

    @Override
    public List<Customer> getByNameLike(String name) {
        return customerRepository.findByNameLike(name);
    }

    @Override
    public Page<Customer> getAllWithPagination(Pageable pageable) {
        return customerRepository.findAllWithPagination(pageable);
    }

    @Override
    public Page<Customer> getByNameLike(String name, Pageable pageable) {
        return customerRepository.findByNameLike(name, pageable);
    }

}
