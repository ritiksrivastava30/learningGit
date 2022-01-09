package com.example.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
@ConditionalOnProperty(name="sheduling.enabled", matchIfMissing =true)
class SchedulingConfiguration{
	
	public SchedulingConfiguration() {
	// TODO Auto-generated constructor stub
	}
}