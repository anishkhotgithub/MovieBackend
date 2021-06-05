package com.anish.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="seasons")
public class Seasons 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	private String seasonNo;
	
	@Column(columnDefinition = "TEXT")
	private String seasonDesc;
	private String seasonimgurl;
	private String videoimgurl;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Movie movie;
	
	public Seasons() {
		super();
	}

	/*
	 * public Seasons(int sid, String seasonNo, String seasonDesc, String
	 * seasonimgurl) { super(); this.sid = sid; this.seasonNo = seasonNo;
	 * this.seasonDesc = seasonDesc; this.seasonimgurl = seasonimgurl; }
	 */

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSeasonNo() {
		return seasonNo;
	}

	public void setSeasonNo(String seasonNo) {
		this.seasonNo = seasonNo;
	}

	public String getSeasonDesc() {
		return seasonDesc;
	}

	public void setSeasonDesc(String seasonDesc) {
		this.seasonDesc = seasonDesc;
	}

	public String getSeasonimgurl() {
		return seasonimgurl;
	}

	public void setSeasonimgurl(String seasonimgurl) {
		this.seasonimgurl = seasonimgurl;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Movie getMovie() {
		return movie;
	}

	public String getVideoimgurl() {
		return videoimgurl;
	}

	public void setVideoimgurl(String videoimgurl) {
		this.videoimgurl = videoimgurl;
	}
	
	
	
}
