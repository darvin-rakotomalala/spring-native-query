package com.poc.service.applicatif;

import com.poc.mapper.CustomerMapper;
import com.poc.mapper.ProjectionViewMapper;
import com.poc.model.domain.view.CustomerView;
import com.poc.model.dto.CustomerDTO;
import com.poc.model.dto.view.ProjectionViewDTO;
import com.poc.service.metier.CustomerRSM;
import com.poc.utils.HelpPage;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerRSAImpl implements CustomerRSA {

    private final CustomerRSM customerRSM;
    private final CustomerMapper customerMapper;
    private final ProjectionViewMapper projectionViewMapper;

    @Override
    public List<CustomerDTO> getByGradeNative() {
        return customerMapper.toDTO(customerRSM.getByGradeNative());
    }

    @Override
    public List<CustomerView> getGroupByCityAndMaxGrade() {
        return customerRSM.getGroupByCityAndMaxGrade();
    }

    @Override
    public List<ProjectionViewDTO> getCustomerGroupByCityAndMaxGrade() {
        return projectionViewMapper.toDTO(customerRSM.getCustomerGroupByCityAndMaxGrade());
    }

    @Override
    public List<CustomerDTO> getByNameLike(String name) {
        return customerMapper.toDTO(customerRSM.getByNameLike(name));
    }

    @Override
    public HelpPage<CustomerDTO> getAllWithPagination(Pageable pageable) {
        return customerMapper.toDTO(customerRSM.getAllWithPagination(pageable), pageable);
    }

    @Override
    public HelpPage<CustomerDTO> getByNameLike(String name, Pageable pageable) {
        return customerMapper.toDTO(customerRSM.getByNameLike(name, pageable), pageable);
    }

}
