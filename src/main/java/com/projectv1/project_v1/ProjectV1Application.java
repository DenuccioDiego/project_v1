package com.projectv1.project_v1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin("http://localhost:4200")
public class ProjectV1Application {

	public static void main(String[] args) {
		SpringApplication.run(ProjectV1Application.class, args);
	}

}
