package com.anish.daoimpl;

import java.util.List;

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
	public boolean addProduct(Movie m)
	{
		sessionFactory.getCurrentSession().save(m);
		return true;
	}

	@Override
	public boolean delProduct(Movie m) {
		sessionFactory.getCurrentSession().delete(m);
		return true;
	}

	@Override
	public boolean updProduct(Movie m) {
		sessionFactory.getCurrentSession().saveOrUpdate(m);
		return true;
	}

	@Override
	public List<Movie> dispProducts() {
		return sessionFactory.getCurrentSession().createCriteria(Movie.class).list();
	}
	
}
