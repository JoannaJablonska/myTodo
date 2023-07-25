package com.lhg.mytodo.core.model;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Task {

	TaskStatus status;

	String name;

	String description;

	LocalDateTime due;
}
