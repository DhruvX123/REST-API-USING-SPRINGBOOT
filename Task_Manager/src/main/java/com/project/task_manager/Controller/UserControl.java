package com.project.task_manager.Controller;

import com.project.task_manager.DTO.UserDTO;
import com.project.task_manager.Entity.User;
import com.project.task_manager.Service.Impl.UserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserControl {

    @Autowired
    private UserImpl userimpl;

    @PostMapping("/create-user")
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO) {
        UserDTO userDTO1 = userimpl.createUser(userDTO);
        return new ResponseEntity<>(userDTO1, HttpStatus.CREATED);
    }

    @GetMapping("/get-user/{id}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable Long id) {
        UserDTO userDto = userimpl.getUserById(id);
        return new  ResponseEntity<>(userDto, HttpStatus.OK);
    }

    @PutMapping("/update-user/{id}")
    public ResponseEntity<UserDTO> updateUser(@RequestBody UserDTO userDTO, @PathVariable Long id) {
        UserDTO userDto1 = userimpl.updateUser(userDTO, id);
        return ResponseEntity.ok(userDto1);
    }

    @DeleteMapping("/delete-user/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        userimpl.deleteUser(id);
        return ResponseEntity.ok("Deleted");
    }

}
