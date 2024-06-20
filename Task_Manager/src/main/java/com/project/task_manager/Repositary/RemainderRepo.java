package com.project.task_manager.Repositary;

import com.project.task_manager.Entity.Remainder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RemainderRepo extends JpaRepository<Remainder, Long> {
}
