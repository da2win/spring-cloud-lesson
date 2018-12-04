package com.da2win.springcloudlesson4eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringCloudLesson4EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudLesson4EurekaServerApplication.class, args);
	}
}
