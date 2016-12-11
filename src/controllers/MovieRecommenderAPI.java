package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Movie;
import models.Rating;
import models.User;

public class MovieRecommenderAPI implements MovieRecommenderInterface
{

	@Override
	public void addUser(String firstName, String lastName, int age, char gender, String occupation) 
	{
		
	}

	@Override
	public void removeUser(long userID) 
	{
		
	}

	@Override
	public void addMovie(String title, int year, String url) 
	{
		
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
