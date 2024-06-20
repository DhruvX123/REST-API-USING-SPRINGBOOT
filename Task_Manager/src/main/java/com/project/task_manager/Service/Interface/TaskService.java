package com.project.task_manager.Service.Interface;

import com.project.task_manager.DTO.TaskDTO;

public interface TaskService {
    public TaskDTO createTask(TaskDTO taskDTO);
    public TaskDTO getTaskById(Long id);
    TaskDTO updateTask(TaskDTO taskDTO, Long id);
    TaskDTO deleteTask(Long id);

}
