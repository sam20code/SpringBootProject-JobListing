package com.springApplication.JobListing.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection = "JobListing")
public class Post {
    private String desc;
    private String profile;
    private String tech[];
    private int exp;

    @Override
    public String toString() {
        return "Post{" +
                "desc='" + desc + '\'' +
                ", profile='" + profile + '\'' +
                ", tech=" + Arrays.toString(tech) +
                ", exp=" + exp +
                '}';
    }

    public Post() {
    }

    public Post(String desc, String profile, String[] tech, int exp) {
        this.desc = desc;
        this.profile = profile;
        this.tech = tech;
        this.exp = exp;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public void setTech(String[] tech) {
        this.tech = tech;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getDesc() {
        return desc;
    }

    public String getProfile() {
        return profile;
    }

    public String[] getTech() {
        return tech;
    }

    public int getExp() {
        return exp;
    }
}
