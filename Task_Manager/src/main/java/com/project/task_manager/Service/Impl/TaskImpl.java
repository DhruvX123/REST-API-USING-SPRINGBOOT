package com.project.task_manager.Service.Impl;

import com.project.task_manager.DTO.TaskDTO;
import com.project.task_manager.Entity.Task;
import com.project.task_manager.Mapper.TaskMapper;
import com.project.task_manager.Repositary.TaskRepo;
import com.project.task_manager.Service.Interface.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskImpl implements TaskService {

    @Autowired
    private TaskMapper taskMapper;

    @Autowired
    private TaskRepo taskRepo;

    @Override
    public TaskDTO createTask(TaskDTO taskDTO){
        Task task = taskMapper.TaskDtoToTask(taskDTO);
        task = taskRepo.save(task);
        return taskMapper.TaskToTaskDTO(task);
    }

    @Override
    public TaskDTO getTaskById(Long id) {
        Task task = taskRepo.findById(id).get();
        return taskMapper.TaskToTaskDTO(task);
    }

    @Override
    public TaskDTO updateTask(TaskDTO taskDTO, Long id) {
        return null;
    }

    @Override
    public TaskDTO deleteTask(Long id) {
        Task task = taskRepo.findById(id).get();
        taskRepo.delete(task);
        return taskMapper.TaskToTaskDTO(task);
    }
}
