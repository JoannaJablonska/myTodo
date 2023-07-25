package com.lhg.mytodo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lhg.mytodo.ui.commons.SystemTimeProvider;
import com.lhg.mytodo.ui.commons.TimeProvider;

@Configuration
public class MyTodoApplicationConfiguration {

	@Bean
	public TimeProvider timeProvider() {
		return new SystemTimeProvider();
	}

}
