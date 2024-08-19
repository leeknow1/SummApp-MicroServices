package com.leeknow.summdb;

import jakarta.annotation.PostConstruct;
import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SummDbApplication {

	@Value("${spring.datasource.url}")
	private String dataSource;

	@Value("${spring.datasource.username}")
	private String username;

	@Value("${spring.datasource.password}")
	private String password;

	public static void main(String[] args) {
		SpringApplication.run(SummDbApplication.class, args);
	}

	@PostConstruct
	public void migrate() {
		Flyway flyway = Flyway.configure().dataSource(dataSource, username, password).load();
		flyway.migrate();
	}
}
