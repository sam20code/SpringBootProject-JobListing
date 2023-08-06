package com.springApplication.JobListing.repository;

import com.springApplication.JobListing.model.Post;

import java.util.List;

public interface SearchJobRepository {

    List<Post> filterJob(String text);
}
