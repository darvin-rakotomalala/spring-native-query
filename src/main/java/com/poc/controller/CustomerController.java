package com.poc.controller;

import com.poc.model.domain.view.CustomerView;
import com.poc.model.dto.CustomerDTO;
import com.poc.model.dto.view.ProjectionViewDTO;
import com.poc.repository.CustomerRepository;
import com.poc.service.applicatif.CustomerRSA;
import com.poc.service.applicatif.JsonToObjectSA;
import com.poc.utils.HelpPage;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping(path = "customers")
@RequiredArgsConstructor
public class CustomerController {

    private final JsonToObjectSA jsonToObjectSA;
    private final CustomerRSA customerRSA;
    private final CustomerRepository customerRepository;

    @GetMapping("/convert-to-list-object")
    public List<CustomerDTO> convertJsonToListObject() throws IOException {
        return jsonToObjectSA.jsonToCustomerDTOList();
    }

    @GetMapping("/grade")
    public List<CustomerDTO> getByGradeNative() {
        return customerRSA.getByGradeNative();
    }

    @GetMapping("/group-by-city")
    public List<CustomerView> getGroupByCityAndMaxGrade() {
        return customerRSA.getGroupByCityAndMaxGrade();
    }

    @GetMapping("/projection")
    public List<ProjectionViewDTO> getCustomerGroupByCityAndMaxGrade() {
        return customerRSA.getCustomerGroupByCityAndMaxGrade();
    }

    @GetMapping("/search")
    public List<CustomerDTO> getByNameLike(@RequestParam(name = "name", required = true) String name) {
        return customerRSA.getByNameLike(name);
    }

    @GetMapping
    public HelpPage<CustomerDTO> getAllWithPagination(
            @RequestParam(defaultValue = "0", required = false) int page,
            @RequestParam(defaultValue = "15", required = false) int size) {
        Pageable pageable = PageRequest.of(page, size);
        return customerRSA.getAllWithPagination(pageable);
    }

    @GetMapping("/search-name")
    public HelpPage<CustomerDTO> getByNameLike(
            @RequestParam(name = "name", required = true) String name,
            @RequestParam(defaultValue = "0", required = false) int page,
            @RequestParam(defaultValue = "15", required = false) int size) {
        Pageable pageable = PageRequest.of(page, size);
        return customerRSA.getByNameLike(name, pageable);
    }

}