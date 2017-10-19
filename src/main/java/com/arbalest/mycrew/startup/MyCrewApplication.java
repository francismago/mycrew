package com.arbalest.mycrew.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.arbalest.mycrew")
@EnableJpaRepositories(basePackages = "com.arbalest.mycrew.repository" )
@EntityScan(basePackages = "com.arbalest.mycrew.model.db")
public class MyCrewApplication  {



	public static void main(String[] args) {
		SpringApplication.run(MyCrewApplication.class, args);
	}
}
