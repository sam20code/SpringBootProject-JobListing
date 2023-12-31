# Spring Boot Project - JobListing
A Spring Boot application using MongoDB a database. Which allows user to perform post job, retrieves job, search job features. Key concepts this applications highlights CRUD operation, efficient search query by indexing and making custom method to interact with database

---
## Technologies Used:
---
- `Spring Boot`: For building the REST API and managing application components.
- `MongoDB`: As the database to store job listings and enable fast retrieval using MongoDB's aggregation capabilities.
- `Java`, `Postamn`
- Dependencies used
  - `Spring web application`
  - `NoSQL dependencies`
  
## Introduction:
---
- The Job Listing System is a Spring Boot-based REST API that enables users to post and search job listings.
- It provides endpoints for
  - posting new job listings - key concept - `CRUD operations`,
  - retrieving all existing job listings,
  - and searching for jobs based on specified criteria - key concept - `Indexing of data`

---
## Description:
---
- The Job Listing System is designed to facilitate the process of job posting and job searching.
- It utilizes Spring Boot and MongoDB for efficient data storage and retrieval.
- The API allows users to create job postings, view all available job listings, and search for jobs based on specific keywords.
- Inorder to make retrival quick we indexed the data first and then aggregate to form query later uses that query in java.
---
## Key Features:
---
- Post Job Listings: Users can post new job listings with details such as job title, description, and required skills.
- View All Job Listings: The system provides an endpoint to retrieve all existing job listings in the database.
- Search Jobs: Users can search for job listings based on specified keywords, such as required skills, job description, or job profile.
---

