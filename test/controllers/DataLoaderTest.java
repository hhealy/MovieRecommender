package controllers;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import models.Movie;
import models.Rating;
import models.User;

public class DataLoaderTest 
{
	private DataLoader loader;
	private String userData;
	private String movieData;
	private String ratingData;
	
	private List<User> users;
	private User user1;
	private User user2;
	private User user3;
	private User user4;
	private User user5;
	
	private List<Movie> movies;
	private Movie movie1;
	private Movie movie2;
	private Movie movie3;
	private Movie movie4;
	private Movie movie5;
	private Movie movie6;
	private Movie movie7;
	private Movie movie8;
	private Movie movie9;
	private Movie movie10;

	private List<Rating> ratings;
	private Rating rating1;
	private Rating rating2;
	private Rating rating3;
	private Rating rating4;
	private Rating rating5;

	@Before
	public void setUp()
	{
		loader = new DataLoader();
		userData = "moviedata_small/users5.dat";
		movieData = "moviedata_small/items5.dat";
		ratingData = "moviedata_small/FirstFive.dat";
		
		user1 = new User("Leonard", "Hernandez", 24, 'M', "technician", 1l);
		user2 = new User("Melody", "Roberson", 53, 'F', "other", 2l);
		user3 = new User("Gregory", "Newton", 23,  'M', "writer", 3l);
		user4 = new User("Oliver", "George", 24, 'M', "technician", 4l);
		user5 = new User("Jenna", "Parker", 33, 'F', "other", 5l);
		users = new ArrayList<User>();
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		
		movie1 = new Movie(1l, "Toy Story (1995)", "01-Jan-1995", "http://us.imdb.com/M/title-exact?Toy%20Story%20(1995)");
		movie2 = new Movie(2l, "GoldenEye (1995)", "01-Jan-1995", "http://us.imdb.com/M/title-exact?GoldenEye%20(1995)");
		movie3 = new Movie(3l, "Four Rooms (1995)", "01-Jan-1995", "http://us.imdb.com/M/title-exact?Four%20Rooms%20(1995)");
		movie4 = new Movie(4l, "Get Shorty (1995)", "01-Jan-1995", "http://us.imdb.com/M/title-exact?Get%20Shorty%20(1995)");
		movie5 = new Movie(5l, "Copycat (1995)", "01-Jan-1995", "http://us.imdb.com/M/title-exact?Copycat%20(1995)");
		movie6 = new Movie(6l, "Shanghai Triad (Yao a yao yao dao waipo qiao) (1995)", "01-Jan-1995", "http://us.imdb.com/Title?Yao+a+yao+yao+dao+waipo+qiao+(1995)");
		movie7 = new Movie(7l, "Twelve Monkeys (1995)", "01-Jan-1995", "http://us.imdb.com/M/title-exact?Twelve%20Monkeys%20(1995)");
		movie8 = new Movie(8l, "Babe (1995)", "01-Jan-1995", "http://us.imdb.com/M/title-exact?Babe%20(1995)");
		movie9 = new Movie(9l, "Dead Man Walking (1995)", "01-Jan-1995", "http://us.imdb.com/M/title-exact?Dead%20Man%20Walking%20(1995)");
		movie10 = new Movie(10l, "Richard III (1995)", "01-Jan-1996", "http://us.imdb.com/M/title-exact?Richard%20III%20(1995)");
		movies = new ArrayList<Movie>();
		movies.add(movie1);
		movies.add(movie2);
		movies.add(movie3);
		movies.add(movie4);
		movies.add(movie5);
		movies.add(movie6);
		movies.add(movie7);
		movies.add(movie8);
		movies.add(movie9);
		movies.add(movie10);
		
		
		rating1 = new Rating(2l, 10l, 1);
		rating2 = new Rating(2l, 10l, 1);
		rating3 = new Rating(4l, 10l, 3);
		rating4 = new Rating(4l, 10l, 5);
		rating5 = new Rating(5l, 10l, -5);
		ratings = new ArrayList<Rating>();
		ratings.add(rating1);
		ratings.add(rating2);
		ratings.add(rating3);
		ratings.add(rating4);
		ratings.add(rating5);
	}
	
	@Test
	public void testLoadUsers() throws Exception 
	{
		assertEquals(loader.loadUsers(userData).toString(), users.toString());
	}
	
	@Test
	public void testLoadMovies() throws Exception
	{
		assertEquals(loader.loadMovies(movieData).toString(), movies.toString());
	}
	
	@Test
	public void testLoadRatings() throws Exception
	{
		assertEquals(loader.loadRating(ratingData).toString(), ratings.toString());
	}
	
	@After
	public void tearDown() throws Exception
	{
		
	}
}