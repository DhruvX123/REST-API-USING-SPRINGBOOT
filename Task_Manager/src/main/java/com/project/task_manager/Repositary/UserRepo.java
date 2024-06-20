package com.project.task_manager.Repositary;

import com.project.task_manager.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
