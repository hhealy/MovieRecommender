package models;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RatingTest 
{

	@Before
	public void setUp() throws Exception 
	{
		
	}
	
	@Test
	public void testGetMovieID() 
	{
		assertEquals(12345l, ModelTest.ratings[0].getMovieID());
		assertEquals(23456L, ModelTest.ratings[1].getMovieID());
	}
	
	@Test
	public void testGetUserID()
	{
		assertEquals(12, ModelTest.ratings[0].getUserID());
		assertEquals(13, ModelTest.ratings[1].getUserID());
	}
	
	@Test
	public void testGetRating() 
	{
		assertEquals(1, ModelTest.ratings[0].getRating());
		assertEquals(4, ModelTest.ratings[1].getRating());
		assertEquals(-1, ModelTest.ratings[2].getRating());
		assertEquals(0, ModelTest.ratings[3].getRating());
	}
	
	@After
	public void tearDown() throws Exception 
	{
		
	}

}