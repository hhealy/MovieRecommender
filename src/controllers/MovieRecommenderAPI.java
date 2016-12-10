package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Movie;
import models.Rating;
import models.User;

public class MovieRecommenderAPI implements MovieRecommenderInterface
{

	@Override
	public void addUser(String firstName, String lastName, int age, String gender, String occupation) 
	{
		
	}

	@Override
	public void removeUser(double userID) 
	{
		
	}

	@Override
	public void addMovie(String title, int year, String url) 
	{
		
	}

	@Override
	public void addRating(double userID, double movieID, int rating) 
	{
		
	}

	@Override
	public String getMovie(double movieID) 
	{
		return null;
	}

	@Override
	public int getUserRating(double userID) 
	{
		return 0;
	}

	@Override
	public String getUserRecommendation(double userID) 
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
