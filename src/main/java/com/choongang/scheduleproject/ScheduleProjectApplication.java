package com.choongang.scheduleproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class ScheduleProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScheduleProjectApplication.class, args);
	}

}
