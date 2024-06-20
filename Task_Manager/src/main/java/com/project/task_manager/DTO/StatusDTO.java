package com.project.task_manager.DTO;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter

public class StatusDTO {

    private Long status_id;
    private String status_state;
    private Long remainder_id;
}
