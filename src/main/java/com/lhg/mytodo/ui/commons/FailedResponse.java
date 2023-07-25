package com.lhg.mytodo.ui.commons;

import java.time.Instant;

import lombok.Value;

@Value
public class FailedResponse {

	Instant timestamp;

	String description;
}
