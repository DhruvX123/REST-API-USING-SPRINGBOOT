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

public class Remainder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long remainder_id;
    private Long task_id;
    private int remainder_date;

}
