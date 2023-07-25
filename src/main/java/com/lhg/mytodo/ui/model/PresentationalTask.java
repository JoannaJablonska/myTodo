package com.lhg.mytodo.ui.model;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class PresentationalTask {

	PresentationalTaskStatus status;

	String name;

	String description;

	LocalDateTime due;
}
