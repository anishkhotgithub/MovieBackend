package com.anish.daoimpl;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anish.dao.SeasonDAO;
import com.anish.model.Movie;
import com.anish.model.Seasons;

@Transactional
@Repository
public class SeasonDAOImpl implements SeasonDAO 
{
	@Autowired
	SessionFactory sessionFactory;
	
	
	@Override
	public boolean addSeason(Seasons s) 
	{
		sessionFactory.getCurrentSession().save(s);
		return true;
	}

	@Override
	public boolean delSeason(Seasons s) 
	{
		sessionFactory.getCurrentSession().delete(s);
		return true;
	}

	@Override
	public boolean updSeason(Seasons s) {
		sessionFactory.getCurrentSession().saveOrUpdate(s);
		return true;
	}

	@Override
	public List<Seasons> dispSeasons(int Movieid) 
	{
		try
		{
			Query query=sessionFactory.getCurrentSession().createQuery("from Seasons where movie.movieID = :id");
			query.setParameter("id", Movieid);
			return query.getResultList();
		}
		catch(Exception e)
		{
			System.out.println(e);
			return null;
		}
	}

	@Override
	public Seasons dispSeason(int seasonid) {
		Query query=sessionFactory.getCurrentSession().createQuery("from Seasons where sid = :id");
		query.setParameter("id", seasonid);
		return (Seasons)query.getResultList().get(0);
	}

	@Override
	public List<Seasons> dispSeasons() {
		// TODO Auto-generated method stub
		return null;
	}

}
