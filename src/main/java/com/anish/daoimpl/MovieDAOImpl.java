package com.anish.daoimpl;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anish.dao.MovieDAO;
import com.anish.model.Movie;

@Transactional
@Repository
public class MovieDAOImpl implements MovieDAO
{
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public boolean addMovie(Movie m)
	{
		sessionFactory.getCurrentSession().save(m);
		return true;
	}

	@Override
	public boolean delMovie(Movie m) {
		sessionFactory.getCurrentSession().delete(m);
		return true;
	}

	@Override
	public boolean updMovie(Movie m) {
		sessionFactory.getCurrentSession().saveOrUpdate(m);
		return true;
	}

	@Override
	public List<Movie> dispMovie() {
		return sessionFactory.getCurrentSession().createCriteria(Movie.class).list();
	}

	@Override
	public Movie dispMovie(int movieid)
	{
		Query query=sessionFactory.getCurrentSession().createQuery("from Movie where movieID = :id");
		query.setParameter("id", movieid);
		return (Movie)query.getResultList().get(0);
	}
	
}
