package com.poc.service.metier;

import com.poc.model.domain.Customer;
import com.poc.model.domain.view.CustomerView;
import com.poc.model.domain.view.ProjectionView;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerRSM {
    List<Customer> getByGradeNative();
    List<CustomerView> getGroupByCityAndMaxGrade();
    List<ProjectionView> getCustomerGroupByCityAndMaxGrade();
    List<Customer> getByNameLike(String name);
    Page<Customer> getAllWithPagination(Pageable pageable);
    Page<Customer> getByNameLike(String name, Pageable pageable);
}
