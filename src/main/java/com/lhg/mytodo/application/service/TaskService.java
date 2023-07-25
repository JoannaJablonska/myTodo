package com.lhg.mytodo.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lhg.mytodo.application.repository.TaskRepository;
import com.lhg.mytodo.core.model.Task;
import com.lhg.mytodo.core.model.TaskStatus;
import com.lhg.mytodo.infrastructure.TaskEntity;
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
		return mapper.toTask(taskRepository.findById(id).get());
	}

	public String create(final Task task) {
		final Task taskToCreate = prepareTaskForCreation(task);
		final TaskEntity createdTask = taskRepository.saveAndFlush(mapper.toTaskEntity(taskToCreate));
		return createdTask.getId();
	}

	private static Task prepareTaskForCreation(final Task task) {
		return Task.builder()
				.status(TaskStatus.TO_DO)
				.name(task.getName())
				.description(task.getDescription())
				.due(task.getDue())
				.build();
	}

	public void changeStatus(final String id, final TaskStatus taskStatus) {
		final TaskEntity taskToChange = taskRepository.findById(id).get();
		taskToChange.setStatus(taskStatus);
		taskRepository.save(taskToChange);
	}
}
