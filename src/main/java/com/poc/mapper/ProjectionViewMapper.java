package com.poc.mapper;

import com.poc.common.mapper.DtoMapper;
import com.poc.model.domain.Customer;
import com.poc.model.domain.view.ProjectionView;
import com.poc.model.dto.CustomerDTO;
import com.poc.model.dto.view.ProjectionViewDTO;
import org.mapstruct.Mapper;

@Mapper
public interface ProjectionViewMapper extends DtoMapper<ProjectionViewDTO, ProjectionView> {

}
