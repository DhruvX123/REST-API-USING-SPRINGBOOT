package com.project.task_manager.DTO;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter

public class RemainderDTO {

    private Long remainder_id;
    private Long task_id;
    private int remainder_date;

}
