package com.moonbam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.moonbam.dto.MovieResponseDto;

@Service
public class TestService {
	
	@Value("${tmdb.key}")
	private String key;
	@Autowired
    private RestTemplate restTemplate;
//    private String apiUrl;

//    public TestService(RestTemplate restTemplate) {
//        this.restTemplate = restTemplate;
//    }

//  public ApiResponseDto<MovieResponseDto> movieLatestView() {
    public MovieResponseDto movieLatestView() {
    	String apiUrl = "https://api.themoviedb.org/3/movie/popular?api_key="+key+"&language=ko-KR&page=1";
    	MovieResponseDto movieResponse = restTemplate.getForObject(apiUrl, MovieResponseDto.class);
    	System.out.println(movieResponse);
    	System.out.println("0번째값 테스트: "+ movieResponse.getResults().get(0));
        return movieResponse;
//        return ResponseUtils.ok(movieResponse);
    }
}