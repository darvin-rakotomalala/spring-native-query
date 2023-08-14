package com.poc.service.applicatif;

import com.poc.model.dto.CustomerDTO;

import java.io.IOException;
import java.util.List;

public interface JsonToObjectSA {
    List<CustomerDTO> jsonToCustomerDTOList() throws IOException;
}
