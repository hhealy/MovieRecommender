package models;

import static org.junit.Assert.*;
import static models.ModelTest.movies;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MovieTest
{

	@Before
	public void setUp() throws Exception 
	{
		
	}
	
	@Test
	public void testGetName() 
	{
		assertEquals("Batman Begins", movies[0].getName());
		assertEquals("The Dark Knight", movies[1].getName());
		assertEquals("The Dark Knight Rises", movies[2].getName());
		assertEquals("Inception", movies[3].getName());
		assertNotEquals("Disturbia", movies[2].getName());
	}

	//@Test
	public void testGetYear() 
	{
		assertEquals(2005, movies[0].getYear());
		assertEquals(2008, movies[1].getYear());
		assertEquals(2012, movies[2].getYear());
		assertEquals(2010, movies[3].getYear());
		assertNotEquals(2007, movies[1].getYear());
	}
	
	@Test
	public void testGetMovieID() 
	{
		assertEquals(23l, movies[0].getMovieID(), 0.001);
		assertEquals(22l, movies[1].getMovieID(), 0.001);
		assertEquals(24l, movies[2].getMovieID(), 0.001);
		assertNotEquals(67, movies[0].getMovieID(), 0.001);
		assertNotEquals(10, movies[1].getMovieID(), 0.001);
	}
	
	@Test
	public void testGetUrl() 
	{
		assertEquals("http://www.imdb.com/title/tt0372784/?ref_=nv_sr_3", movies[0].getUrl());
		assertEquals("http://www.imdb.com/title/tt0468569/?ref_=nv_sr_1", movies[1].getUrl());
		assertEquals("http://www.imdb.com/title/tt1345836/?ref_=tt_rec_tt", movies[2].getUrl());
		assertEquals("http://www.imdb.com/title/tt1375666/?ref_=tt_rec_tt", movies[3].getUrl());
		assertNotEquals("http://www.imdb.com/title/tt0486822/?ref_=nv_sr_1", movies[2].getUrl());
	}
	
	@After
	public void tearDown() throws Exception 
	{
		
	}
}