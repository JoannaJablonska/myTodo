package com.lhg.mytodo.ui.model;

import java.time.LocalDateTime;

import jakarta.validation.constraints.Size;
import lombok.Value;

@Value
public class CreateTaskRequest {

	@Size(min = 1, message = "Name is too short")
	@Size(max = 20, message = "Name is too long")
	String name;

	@Size(max = 200, message = "Description is too long")
	String description;

	LocalDateTime due;
}
