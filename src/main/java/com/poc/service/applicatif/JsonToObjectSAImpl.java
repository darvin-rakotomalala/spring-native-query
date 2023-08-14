package com.poc.service.applicatif;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.poc.model.dto.CustomerDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
@Service
public class JsonToObjectSAImpl implements JsonToObjectSA {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
            .enable(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL);

    private final File resource = new ClassPathResource("data/customer.json").getFile();

    public JsonToObjectSAImpl() throws IOException {
    }

    @Override
    public List<CustomerDTO> jsonToCustomerDTOList() throws IOException {
        try {
            log.info("Convert to CustomerDTO list object");

            CustomerDTO[] customerDTOs =
                    objectMapper.readValue(resource, CustomerDTO[].class);
            return new ArrayList<>(Arrays.asList(customerDTOs));
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

}
