package com.example.springconsul;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration
@RestController
@RefreshScope
@SpringBootApplication
public class SpringConsulApplication {
	@Value("${key}")
	private String key;

	@RequestMapping("/")
	public String home() {
		return "Hello World "+ key;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringConsulApplication.class, args);
	}

}
