package com.springApplication.JobListing.controller;

import com.springApplication.JobListing.model.Post;
import com.springApplication.JobListing.repository.JobPostRepository;
import com.springApplication.JobListing.repository.SearchJobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping( "/jobPosting")
public class JobPost {
    @Autowired
    JobPostRepository jobPostRepository;
    @Autowired
    SearchJobRepository searchJobRepository;
    @GetMapping("/showJobs")
    public List<Post> getAllJobPost(){
        return jobPostRepository.findAll();
    }
    @PostMapping("/postJobs")
    public String postJob(@RequestBody Post post){
        jobPostRepository.save(post);
        return "job posted successfully";
    }
    List<Post> post = new ArrayList<>();
    @GetMapping("/searchJobs/{text}")
    public List<Post> searchJobs(@PathVariable String text){
       return searchJobRepository.filterJob(text);
    }
}
