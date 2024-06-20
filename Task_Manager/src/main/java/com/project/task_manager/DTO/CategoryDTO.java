package com.project.task_manager.DTO;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter

public class CategoryDTO {

    private Long category_id;
    private Long user_id;
    private String category_name;
    private Long status_id;

}
