package com.anish.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="Movie")
public class Movie 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int movieID;
	@Column
	@NotEmpty(message="Name is required")
	@Size(min=2,message = "Minimum length for name is 2")
	private String moviename;
	
	@Column
	@NotEmpty(message="Movie Category is required")
	@Size(min=2,message = "Minimum length for category is 4")
	private String movieCategory;
	
	@Column(length = 2000000000)
	@NotEmpty(message="Description is required")
	private String movieDesc;
	
	@Column(length = 2000)
	private String movieimageurl;

	public Movie(String moviename, String movieCategory, String movieDesc, String movieimageurl) {
		super();
		this.moviename = moviename;
		this.movieCategory = movieCategory;
		this.movieDesc = movieDesc;
		this.movieimageurl = movieimageurl;
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
	public String getMovieimageurl() {
		return movieimageurl;
	}
	public void setMovieimageurl(String movieimageurl) {
		this.movieimageurl = movieimageurl;
	}
}
