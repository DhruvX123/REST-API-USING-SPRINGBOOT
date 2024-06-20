package com.project.task_manager.Mapper;

import com.project.task_manager.DTO.StatusDTO;
import com.project.task_manager.Entity.Status;
import jakarta.persistence.Id;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Stack;

@Component
public class StatusMapper {

    @Autowired
    private ModelMapper modelMapper;

    public Status StatusDTOToStatus(StatusDTO statusDTO) {
        Status status = modelMapper.map(statusDTO, Status.class);
        return status;
    }

    public StatusDTO StatusToStatusDTO(Status status) {
        StatusDTO statusDTO = modelMapper.map(status, StatusDTO.class);
        return statusDTO;
    }
}
