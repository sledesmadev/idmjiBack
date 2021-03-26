package com.project.idmji;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@ComponentScan({"com.project.idmji"})
@EntityScan("com.project.idmji.model")
@EnableJpaRepositories("com.project.idmji.repository")
@EnableAsync
public class IdmjiApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdmjiApplication.class, args);
	}

}
