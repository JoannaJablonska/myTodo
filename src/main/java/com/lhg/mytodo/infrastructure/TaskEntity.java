package com.lhg.mytodo.infrastructure;

import java.time.LocalDateTime;
import java.util.UUID;

import com.lhg.mytodo.core.model.TaskStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "Task")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
//@ToString
public class TaskEntity {

	@Id
	String id = UUID.randomUUID().toString();

	TaskStatus status;

	String name;

	String description;

	LocalDateTime due;
}
