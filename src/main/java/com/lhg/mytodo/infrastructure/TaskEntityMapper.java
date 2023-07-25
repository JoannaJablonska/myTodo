package com.lhg.mytodo.infrastructure;

import java.util.List;

import org.mapstruct.Mapper;

import com.lhg.mytodo.core.model.Task;

@Mapper(componentModel = "spring")
public interface TaskEntityMapper {

	Task toTask(TaskEntity taskEntity);

	List<Task> toMultipleTasks(List<TaskEntity> taskEntities);

	TaskEntity toTaskEntity(Task task);
}
