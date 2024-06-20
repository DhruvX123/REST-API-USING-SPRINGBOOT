package com.project.task_manager.Service.Interface;

import com.project.task_manager.DTO.UserDTO;

public interface UserService {

    public UserDTO createUser(UserDTO userDTO);
    public UserDTO getUserById(Long id);
    //public List<UserDTO> getAllUser();
    UserDTO updateUser(UserDTO userDTO, Long id);
    UserDTO deleteUser(Long id);

}
