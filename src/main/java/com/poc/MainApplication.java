package com.poc;

import com.poc.model.dto.CustomerDTO;
import com.poc.repository.CustomerRepository;
import com.poc.service.applicatif.CustomerCUDSA;
import com.poc.service.applicatif.JsonToObjectSA;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@Slf4j
@SpringBootApplication
public class MainApplication implements ApplicationRunner {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private JsonToObjectSA jsonToObjectSA;

    @Autowired
    private CustomerCUDSA customerCUDSA;

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("############################   RUN   ############################");

        /*customerRepository.deleteAll();
        List<CustomerDTO> customers = jsonToObjectSA.jsonToCustomerDTOList();
        customerCUDSA.saveListCustomers(customers);*/

    }
}
