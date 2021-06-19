package com.leens.repasitory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.leens.repasitory.dao")
@ComponentScan("com.leens.*")
public class SpringMongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMongoDbApplication.class, args);
	}

}
