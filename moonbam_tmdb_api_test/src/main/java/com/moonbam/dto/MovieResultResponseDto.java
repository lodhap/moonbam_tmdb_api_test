package com.moonbam.dto;

import java.time.LocalDate;

public class MovieResultResponseDto {
    private Long id;
    private String overview;
    private LocalDate release_date;
    private String title;
    private float vote_average;

    private String popularity;
    private String poster_path;
    private int vote_count;
    private String original_language;
	public Long getId() {
		return id;
	}

	public String getOverview() {
		return overview;
	}

	public LocalDate getRelease_date() {
		return release_date;
	}

	public String getTitle() {
		return title;
	}

	public float getVote_average() {
		return vote_average;
	}

	public String getPopularity() {
		return popularity;
	}

	public String getPoster_path() {
		return poster_path;
	}

	public int getVote_count() {
		return vote_count;
	}

	public String getOriginal_language() {
		return original_language;
	}


    
}
