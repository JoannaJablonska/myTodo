package com.lhg.mytodo.ui.model;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum PresentationalTaskStatus {

	TO_DO("To do"),
	IN_PROGRESS("In progress"),
	QA("QA"),
	DONE("Done");

	@JsonValue
	private final String value;
}
