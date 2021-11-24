package com.hbrs.SrpingBootIntegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan("com.hbrs")
@EnableMongoRepositories("com.hbrs.Repository")  // get repository
@EntityScan("com.hbrs.Data") // get data (entity)
public class SrpingBootIntegrationApplication {


	public static void main(String[] args) {
		// run springboot application
		SpringApplication.run(SrpingBootIntegrationApplication.class, args);
	}


}
