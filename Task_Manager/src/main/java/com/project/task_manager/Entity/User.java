package com.project.task_manager.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long user_id;
    private String name;
    private String email;
    private String username;
    private String password;


}
