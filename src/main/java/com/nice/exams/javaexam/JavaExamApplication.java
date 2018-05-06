package com.nice.exams.javaexam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class JavaExamApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaExamApplication.class, args);
	}
}
