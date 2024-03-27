package com.moonbam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.moonbam.service.TmdbApiService;

@Controller
public class TmdbApiController {
	
	@Autowired
	TmdbApiService tmdbApiService;
	
	// /getAndSaveMovies?limitPage=10
	// tmdb 사이트에서 영화데이터를 인기순으로 20개(1페이지)씩 가져오는 주소 
	// limitPage 쿼리를 조정하여 저장할 페이지수 조정 (최대1000)
	@RequestMapping(value="/getAndSaveMovies", method=RequestMethod.GET)
	@ResponseBody
	public String getAndSaveMovies(int limitPage) {
		
		//임시구문
		if(limitPage==0) {
			limitPage=1;
		}
		
		int insertedPage = 0;
		try {
			insertedPage = tmdbApiService.getAndSaveMovies(limitPage);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("종료 : " + insertedPage + "페이지까지 저장됨");
		return "종료 : " + insertedPage + "페이지까지 저장됨";
	}
}
