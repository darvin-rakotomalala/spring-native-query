package com.poc.repository;

import com.poc.model.domain.Customer;
import com.poc.model.domain.view.CustomerView;
import com.poc.model.domain.view.ProjectionView;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, String> {

    @Query(value = "SELECT customer_id, cust_name, city, grade, salesman_id " +
            "FROM customer WHERE grade = 100", nativeQuery = true)
    List<Customer> findByGradeNative();

    @Query(value = "SELECT * FROM customer c WHERE c.cust_name LIKE %?1%", nativeQuery = true)
    List<Customer> findByNameLike(String name);

    @Query(value = "SELECT * FROM customer", nativeQuery = true)
    Page<Customer> findAllWithPagination(Pageable pageable);

    @Query(value = "SELECT * FROM customer c WHERE LOWER(c.cust_name) LIKE LOWER(CONCAT('%', ?1,'%'))", nativeQuery = true)
    Page<Customer> findByNameLike(String name, Pageable pageable);

    @Query(value = "SELECT city, MAX(grade) FROM customer GROUP BY city", nativeQuery = true)
    List<CustomerView> findGroupByCityAndMaxGrade();

    @Query(nativeQuery = true)
    List<ProjectionView> findCustomerGroupByCityAndMaxGrade();

}
