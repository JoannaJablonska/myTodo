package com.lhg.mytodo.ui.commons;

import java.time.Instant;

public class SystemTimeProvider implements TimeProvider {

	@Override
	public Instant getTimestamp() {
		return Instant.now();
	}

}

