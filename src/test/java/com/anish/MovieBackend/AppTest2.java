package com.anish.MovieBackend;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.anish.dao.MovieDAO;
import com.anish.model.Movie;
import com.anish.config.AppConfig;

@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=AppConfig.class)
public class AppTest2 
{
	@Autowired MovieDAO mdao;
	
	@Test
	@Ignore
	public void testAddProd()
	{
		assertEquals(true, mdao.addProduct(new Movie("Avenger", "Action", "Marvel")));
	}
	
	@Test
	@Ignore
	public void testUpdProd()
	{
		Movie m = new Movie("Conjuring", "Horror", "Truth");
		m.setMovieID(1);;
		
		assertEquals(true, mdao.updProduct(m));
	}
	
	@Test
	@Ignore
	public void testDelProd()
	{
		Movie m = new Movie();
		m.setMovieID(1);
		
		assertEquals(true, mdao.delProduct(m));
	}
	
	@Test
	public void testDispProd()
	{
		assertNotEquals(null, mdao.dispProducts());
	}
}
