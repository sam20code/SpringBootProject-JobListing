package com.springApplication.JobListing;

import com.springApplication.JobListing.repository.JobPostRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class JobListingApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobListingApplication.class, args);
	}

}
