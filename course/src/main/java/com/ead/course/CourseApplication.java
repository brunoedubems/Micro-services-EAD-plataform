package com.ead.course;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.ead.course")

public class CourseApplication {

	public static void main(String[] args) {

		SpringApplication.run(CourseApplication.class, args);

	}
}
