package com.lhg.mytodo.core.model;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;
import lombok.Value;

@Data
@Builder
public class Task {

	TaskStatus status;

	String name;

	String description;

	LocalDateTime due;
}
