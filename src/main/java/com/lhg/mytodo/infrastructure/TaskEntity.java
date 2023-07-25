package com.lhg.mytodo.infrastructure;

import java.time.LocalDateTime;

import com.lhg.mytodo.core.model.TaskStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity(name = "Task")
@Data
@EqualsAndHashCode(of = "id")
public class TaskEntity {

	@Id
	String id;

	TaskStatus status;

	String name;

	String description;

	LocalDateTime due;
}
