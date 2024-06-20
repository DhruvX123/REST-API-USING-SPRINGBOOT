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
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long task_id;
    private Long user_id;
    private String title;
    private String description;
    private Long category_id;
    private int due_date;
}
