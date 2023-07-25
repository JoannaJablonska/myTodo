package com.lhg.mytodo.infrastructure;

import java.util.List;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import com.lhg.mytodo.core.model.Task;

@Component
@Mapper(componentModel = "spring")
public interface TaskEntityMapper {

	Task toTask(TaskEntity taskEntity);

	List<Task> toMultipleTasks(List<TaskEntity> taskEntities);

	TaskEntity toTaskEntity(Task task);
}
