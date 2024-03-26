package com.moonbam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.moonbam.dto.MovieResponseDto;
import com.moonbam.service.TestService;

@RestController
public class TestController {
	@Autowired
    private TestService service;

    @GetMapping("/test")
    @ResponseBody
    public MovieResponseDto test() {
    	MovieResponseDto movieResponse = service.movieLatestView();
        return movieResponse;
    }
}