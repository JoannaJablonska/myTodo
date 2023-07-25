package com.lhg.mytodo.core.model;

import java.time.LocalDateTime;

import lombok.Value;

@Value
public class Task {

	TaskStatus status;

	String name;

	String description;

	LocalDateTime due;
}
