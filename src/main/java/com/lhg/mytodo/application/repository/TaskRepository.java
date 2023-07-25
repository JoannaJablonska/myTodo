package com.lhg.mytodo.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.lhg.mytodo.infrastructure.TaskEntity;

@Component
public interface TaskRepository extends JpaRepository<TaskEntity, String> {

}
