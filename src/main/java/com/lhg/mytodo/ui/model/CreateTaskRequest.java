package com.lhg.mytodo.ui.model;

import java.time.LocalDateTime;

import lombok.Value;

@Value
public class CreateTaskRequest {

	String name;

	String description;

	LocalDateTime due;
}
