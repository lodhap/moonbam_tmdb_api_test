package com.moonbam.dto;

import java.time.LocalDate;

public class MovieResultResponseDto {
//	컨텐츠 id : contId - id
//	컨텐츠 제목 : contTitle - title
//	감독id : producerId - 없음
//	설명 : description - overview
//	국가 : nation - original_language / production_countries (제작 국가)
//	출시일 : releaseDate - release_date
//	평균별점 : avgRate - vote_average
//	컨텐츠유형 : contType
//	컨텐츠이미지 : contImg - poster_path, backdrop_path

	
// append_to_response=credits 를 요청 쿼리에 추가하면 배우와 스태프 관련 정보들도 함께 받을 수 있다.
//	컨텐츠 이미지는 기본url + 사이즈 + 파일명 을 조합해서 구성해야함 
//	기본url과 사이즈는 https://developer.themoviedb.org/reference/configuration-detail 참조
	
// 첫 db 세팅 및 데이터 관리 로직에 대해 조언을 구하고 정립해야할듯함
	
//	인기순,트렌딩순, 최신순 등 유의미한 지표 순으로 db에 저장
//	

	
	private Long id;
    private String title;
    //producerID 부재
    private String overview;
    private String original_language;
    private LocalDate release_date;
    
    private float vote_average;

    //private String popularity;
    private String poster_path;
    //private int vote_count;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String getOriginal_language() {
		return original_language;
	}

	public void setOriginal_language(String original_language) {
		this.original_language = original_language;
	}

	public LocalDate getRelease_date() {
		return release_date;
	}

	public void setRelease_date(LocalDate release_date) {
		this.release_date = release_date;
	}

	public float getVote_average() {
		return vote_average;
	}

	public void setVote_average(float vote_average) {
		this.vote_average = vote_average;
	}

	public String getPoster_path() {
		return poster_path;
	}

	public void setPoster_path(String poster_path) {
		this.poster_path = poster_path;
	}

	@Override
	public String toString() {
		return "MovieResultResponseDto [id=" + id + ", title=" + title + ", overview=" + overview
				+ ", original_language=" + original_language + ", release_date=" + release_date + ", vote_average="
				+ vote_average + ", poster_path=" + poster_path + "]";
	}
  
    
    
    
}

