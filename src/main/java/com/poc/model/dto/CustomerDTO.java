package com.poc.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class CustomerDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("customer_id")
    private String id;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("cust_name")
    private String name;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("city")
    private String city;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("grade")
    private int grade;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("salesman_id")
    private int salesmanId;
}
