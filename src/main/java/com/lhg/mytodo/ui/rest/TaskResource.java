package com.lhg.mytodo.ui.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lhg.mytodo.application.service.TaskService;
import com.lhg.mytodo.commons.LocationUri;
import com.lhg.mytodo.ui.model.CreateTaskRequest;
import com.lhg.mytodo.ui.model.PresentationalTask;
import com.lhg.mytodo.ui.model.PresentationalTaskMapper;
import com.lhg.mytodo.ui.model.PresentationalTaskStatus;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/tasks")
@RequiredArgsConstructor
public class TaskResource {

	private final TaskService taskService;

	private final PresentationalTaskMapper mapper;

	@GetMapping
	public ResponseEntity<List<PresentationalTask>> getAll() {
		return ResponseEntity.ok(
				mapper.toMultiplePresentationalTasks(taskService.getAll()));
	}

	@GetMapping("/{id}")
	public ResponseEntity<PresentationalTask> getById(@PathVariable String id) {
		return ResponseEntity.ok(
				mapper.toPresentationalTask(taskService.getById(id)));
	}

	@PostMapping
	public ResponseEntity<String> create(@RequestBody CreateTaskRequest createTaskRequest) {
		String createdId = taskService.create(mapper.toTask(createTaskRequest));
		return ResponseEntity.created(LocationUri.fromRequest(createdId)).build();
	}

	@PutMapping("/{id}")
	public ResponseEntity<Void> changeStatus(@PathVariable String id, @RequestParam("status") PresentationalTaskStatus status) {
		taskService.changeStatus(id, mapper.toTaskStatus(status));
		return ResponseEntity.accepted().build();
	}
}
