package com.springApplication.JobListing.repository;

import com.springApplication.JobListing.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobPostRepository extends MongoRepository<Post,String> {
}
