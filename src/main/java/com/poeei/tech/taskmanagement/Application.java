package com.poeei.tech.taskmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

@SpringBootApplication(exclude = UserDetailsServiceAutoConfiguration.class)
@Controller
@ComponentScan(basePackages = "com.poeei.tech.taskmanagement")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}