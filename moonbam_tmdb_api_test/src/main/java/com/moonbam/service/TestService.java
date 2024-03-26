package com.moonbam.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestService {
    private RestTemplate restTemplate;
    private String apiUrl = "https://jsonplaceholder.typicode.com/posts";

    public TestService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getPosts() {
        return restTemplate.getForObject(apiUrl, String.class);
    }
}