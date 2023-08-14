package com.poc.service.applicatif;

import com.poc.mapper.CustomerMapper;
import com.poc.model.dto.CustomerDTO;
import com.poc.service.metier.CustomerCUDSM;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerCUDSAImpl implements CustomerCUDSA {

    private final CustomerCUDSM customerCUDSM;

    private final CustomerMapper customerMapper;

    @Override
    public void saveListCustomers(List<CustomerDTO> customers) {
        customerCUDSM.saveListCustomers(customerMapper.toDO(customers));
    }

}
