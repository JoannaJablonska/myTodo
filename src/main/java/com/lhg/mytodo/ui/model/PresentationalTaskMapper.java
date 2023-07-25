package com.lhg.mytodo.ui.model;

import java.util.List;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import com.lhg.mytodo.core.model.Task;
import com.lhg.mytodo.core.model.TaskStatus;

@Component
@Mapper(componentModel = "spring")
public interface PresentationalTaskMapper {

	PresentationalTask toPresentationalTask(Task task);

	List<PresentationalTask> toMultiplePresentationalTasks(List<Task> task);

	Task toTask(CreateTaskRequest createTaskRequest);

	TaskStatus toTaskStatus(PresentationalTaskStatus status);
}
