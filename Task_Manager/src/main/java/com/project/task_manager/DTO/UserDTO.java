package com.project.task_manager.DTO;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class UserDTO {

    private Long user_id;
    private String name;
    private String email;
    private String username;
    private String password;
}
