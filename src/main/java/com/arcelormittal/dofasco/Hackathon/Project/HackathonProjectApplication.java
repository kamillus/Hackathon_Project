package com.arcelormittal.dofasco.Hackathon.Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.arcelormittal.dofasco")
public class HackathonProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(HackathonProjectApplication.class, args);
	}
}
