package com.da2win.springcloudlesson1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudLesson1Application {

	public static void main(String[] args) {

		SpringApplication springApplication = new SpringApplication(args);

		springApplication.setWebEnvironment(true);

		springApplication.run(SpringCloudLesson1Application.class);
	}
}
