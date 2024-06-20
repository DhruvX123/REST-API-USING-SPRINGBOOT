package com.project.task_manager.Repositary;

import com.project.task_manager.Entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository<Task, Long> {
}
