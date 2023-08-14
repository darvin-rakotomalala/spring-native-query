package com.poc.service.applicatif;

import com.poc.model.domain.view.CustomerView;
import com.poc.model.dto.CustomerDTO;
import com.poc.model.dto.view.ProjectionViewDTO;
import com.poc.utils.HelpPage;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerRSA {
    List<CustomerDTO> getByGradeNative();
    List<CustomerView> getGroupByCityAndMaxGrade();
    List<ProjectionViewDTO> getCustomerGroupByCityAndMaxGrade();
    List<CustomerDTO> getByNameLike(String name);
    HelpPage<CustomerDTO> getAllWithPagination(Pageable pageable);
    HelpPage<CustomerDTO> getByNameLike(String name, Pageable pageable);
}
