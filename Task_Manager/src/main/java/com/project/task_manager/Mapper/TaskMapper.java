package com.project.task_manager.Mapper;

import com.project.task_manager.DTO.TaskDTO;
import com.project.task_manager.Entity.Task;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TaskMapper {

    @Autowired
    private ModelMapper modelMapper;

    public Task TaskDtoToTask(TaskDTO taskDTO) {
        Task task = modelMapper.map(taskDTO, Task.class);
        return task;
    }

    public TaskDTO TaskToTaskDTO(Task task) {
        TaskDTO taskDTO = modelMapper.map(task, TaskDTO.class);
        return taskDTO;
    }
}
