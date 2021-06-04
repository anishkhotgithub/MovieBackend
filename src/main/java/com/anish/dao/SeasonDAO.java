package com.anish.dao;

import java.util.List;

import com.anish.model.Seasons;

public interface SeasonDAO 
{
	public boolean addSeason(Seasons s);
	public boolean delSeason(Seasons s);
	public boolean updSeason(Seasons s);
	public List<Seasons> dispSeasons(); 
	public Seasons dispSeason(int seasonid);
	List<Seasons> dispSeasons(int Movieid);
}
