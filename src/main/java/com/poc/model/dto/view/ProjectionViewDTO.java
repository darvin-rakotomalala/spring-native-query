package com.poc.model.dto.view;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class ProjectionViewDTO {
    private String city;
    private int max;
}
