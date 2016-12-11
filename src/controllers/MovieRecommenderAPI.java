package controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import models.Movie;
import models.Rating;
import models.User;
import utils.Serializer;

public class MovieRecommenderAPI implements MovieRecommenderInterface
{
	private Serializer serializer;
	public Map<Long, User> userIndex = new HashMap<>();
	public Map<Long, Movie> movieIndex = new HashMap<>();
	public Map<Long, Rating> ratingIndex = new HashMap<>();
	
	public MovieRecommenderAPI(Serializer serialzer)
	{
		this.serializer = serializer;
	}
	
	@Override
	public void addUser(Long userID, String firstName, String lastName, int age, char gender, String occupation) 
	{
		User user = new User(firstName, lastName, age, gender, occupation, userID);
		userIndex.put(userID, user);
	}

	@Override
	public void removeUser(long userID) 
	{
		userIndex.remove(userID);
	}

	@Override
	public void addMovie(Long movieID, String title, String year, String url) 
	{
		Movie movie = new Movie(title, year, url, movieID);
		movieIndex.put(movieID, movie);
	}

	@Override
	public void addRating(long userID, long movieID, int rating) 
	{
		
	}

	@Override
	public String getMovie(long movieID) 
	{
		return null;
	}

	@Override
	public int getUserRating(long userID) 
	{
		return 0;
	}

	@Override
	public String getUserRecommendation(long userID) 
	{
		return null;
	}

	@Override
	public String getTopTenMovies() 
	{
		return null;
	}

	@Override
	public void load() 
	{
		
	}

	@Override
	public void write() 
	{
		
	}

}
