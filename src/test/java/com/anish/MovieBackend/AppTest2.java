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
	public void testAddProd()
	{
		//kept the String null you can add trailer link here to store by adding console 
		assertEquals(true, mdao.addMovie(new Movie("Avenger", "Action", "Marvel","https://i.pinimg.com/originals/0f/03/e6/0f03e6733b0cf567cc92e8e20290462f.jpg" ,"")));
	}
	
	@Test
	@Ignore
	public void testUpdProd()
	{
		Movie m = new Movie("Conjuring", "Horror", "Truth","https://i.pinimg.com/originals/0f/03/e6/0f03e6733b0cf567cc92e8e20290462f.jpg","");
		m.setMovieID(1);;
		
		assertEquals(true, mdao.updMovie(m));
	}
	
	@Test
	@Ignore
	public void testDelProd()
	{
		Movie m = new Movie();
		m.setMovieID(1);
		
		assertEquals(true, mdao.delMovie(m));
	}
	
	@Test
	@Ignore
	public void testDispProd()
	{
		assertNotEquals(null, mdao.dispMovie());
	}
}
