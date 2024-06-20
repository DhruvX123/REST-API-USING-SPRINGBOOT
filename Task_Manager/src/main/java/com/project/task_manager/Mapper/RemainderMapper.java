package com.project.task_manager.Mapper;

import com.project.task_manager.DTO.RemainderDTO;
import com.project.task_manager.Entity.Remainder;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RemainderMapper {

    @Autowired
    private ModelMapper modelMapper;

    public Remainder RemainderDtoToRemainder(RemainderDTO remainderDTO) {
        Remainder remainder = modelMapper.map(remainderDTO, Remainder.class);
        return remainder;
    }

    public RemainderDTO RemainderToRemainderDTO(Remainder remainder) {
        RemainderDTO remainderDTO = modelMapper.map(remainder, RemainderDTO.class);
        return remainderDTO;
    }

}
