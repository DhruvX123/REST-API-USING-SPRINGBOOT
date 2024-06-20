package com.project.task_manager.Service.Impl;

import com.project.task_manager.DTO.UserDTO;
import com.project.task_manager.Entity.User;
import com.project.task_manager.Mapper.UserMapper;
import com.project.task_manager.Repositary.UserRepo;
import com.project.task_manager.Service.Interface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        User user = userMapper.UserDtoToUser(userDTO);
        userRepo.save(user);
        return userMapper.UserToUserDTO(user);
    }

    @Override
    public UserDTO getUserById(Long id) {
        User user = userRepo.findById(id).get();
        return userMapper.UserToUserDTO(user);
    }

    @Override
    public UserDTO updateUser(UserDTO userDTO, Long id) {
        User user = userRepo.findById(id).get();
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());
        User updateUser = userRepo.save(user);
        return userMapper.UserToUserDTO(updateUser);
    }

    @Override
    public UserDTO deleteUser(Long id) {
        User user = userRepo.findById(id).get();
        userRepo.delete(user);
        return userMapper.UserToUserDTO(user);
    }
}
