package com.anish.dao;

import java.util.List;

import com.anish.model.Movie;

public interface MovieDAO
{
	public boolean addProduct(Movie m);
	public boolean delProduct(Movie m);
	public boolean updProduct(Movie m);
	public List<Movie> dispProducts(); 
}
