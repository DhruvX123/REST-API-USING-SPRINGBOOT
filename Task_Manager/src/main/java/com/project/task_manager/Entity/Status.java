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

public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long status_id;
    private String status_state;
    private Long remainder_id;

}
