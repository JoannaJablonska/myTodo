package com.lhg.mytodo.ui.model;

import java.util.List;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import com.lhg.mytodo.core.model.Task;

@Component
@Mapper(componentModel = "spring")
public interface PresentationalTaskMapper {

	PresentationalTask toPresentationalTask(Task task);

	List<PresentationalTask> toMultiplePresentationalTasks(List<Task> task);

	Task toTask(PresentationalTask presentationalTask);

	Task toTask(CreateTaskRequest createTaskRequest);
}
