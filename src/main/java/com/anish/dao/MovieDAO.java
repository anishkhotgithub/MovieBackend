package com.anish.dao;

import java.util.List;

import com.anish.model.Movie;

public interface MovieDAO
{
	public boolean addMovie(Movie m);
	public boolean delMovie(Movie m);
	public boolean updMovie(Movie m);
	public List<Movie> dispMovie(); 
	public Movie dispMovie(int movieid);
}
