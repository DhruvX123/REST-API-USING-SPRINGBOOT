package com.project.task_manager.DTO;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter

public class TaskDTO {

    private Long task_id;
    private Long user_id;
    private String title;
    private String description;
    private Long category_id;
    private int due_date;

}
