package com.anish.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Movie")
public class Movie 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int movieID;
	private String moviename;
	private String movieCategory;
	private String movieDesc;
	
	public Movie(String moviename, String movieCategory, String movieDesc) {
		super();
		this.moviename = moviename;
		this.movieCategory = movieCategory;
		this.movieDesc = movieDesc;
	}
	public Movie() {
		super();
	}
	public int getMovieID() {
		return movieID;
	}
	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public String getMovieCategory() {
		return movieCategory;
	}
	public void setMovieCategory(String movieCategory) {
		this.movieCategory = movieCategory;
	}
	public String getMovieDesc() {
		return movieDesc;
	}
	public void setMovieDesc(String movieDesc) {
		this.movieDesc = movieDesc;
	}
}
