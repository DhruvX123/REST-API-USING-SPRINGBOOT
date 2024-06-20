package com.project.task_manager.Repositary;

import com.project.task_manager.Entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepo extends JpaRepository<Status, Long> {
}
