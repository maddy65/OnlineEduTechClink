package com.onlinetech.clinkk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "courses")

public class Courses {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "Name")
	private String  name;
	
	@Column(name = "Author")
	private String  author;
	
	@Column(name = "Duration")
	private double   duration;
	
	
	@Column(name = "Rating")
	private double   rating;
	
	@Column(name = "videourl")
	private String  videourl;
	
	@Column(name = "popularity")
	private double   popularity;
	
	public Courses() {
		
	}
	
	public Courses(String name, String author, double duration, double rating, String videourl, double popularity) {
		super();
		this.name = name;
		this.author = author;
		this.duration = duration;
		this.rating = rating;
		this.videourl = videourl;
		this.popularity = popularity;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getVideourl() {
		return videourl;
	}

	public void setVideourl(String videourl) {
		this.videourl = videourl;
	}

	public double getPopularity() {
		return popularity;
	}

	public void setPopularity(double popularity) {
		this.popularity = popularity;
	}

	
	
	
	
}
