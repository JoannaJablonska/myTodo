package com.lhg.mytodo.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lhg.mytodo.core.model.Task;
import com.lhg.mytodo.application.repository.TaskRepository;
import com.lhg.mytodo.infrastructure.TaskEntityMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TaskService {

	private final TaskRepository taskRepository;

	private final TaskEntityMapper mapper;

	public List<Task> getAll() {
		return mapper.toMultipleTasks(taskRepository.findAll());
	}

	public Task getById(final String id) {
		return mapper.toTask(taskRepository.getReferenceById(id));
	}

	public String create(final Task task) {
		return taskRepository.saveAndFlush(mapper.toTaskEntity(task))
				.getId();
	}
}
