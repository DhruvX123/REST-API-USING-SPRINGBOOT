package com.project.task_manager.Mapper;

import com.project.task_manager.DTO.UserDTO;
import com.project.task_manager.Entity.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    @Autowired
    private ModelMapper modelMapper;

    public User UserDtoToUser(UserDTO userDTO) {
        User user = modelMapper.map(userDTO, User.class);
        return user;
    }

    public UserDTO UserToUserDTO(User user) {
        UserDTO userDTO = modelMapper.map(user, UserDTO.class);
        return userDTO;
    }

}
