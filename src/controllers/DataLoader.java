package controllers;

import java.io.File;

import java.util.ArrayList;
import java.util.List;
import utils.In;

import models.Movie;
import models.User;
import models.Rating;



public class DataLoader 
{	
	public List<User> loadUsers(String dataFile) throws Exception
	{
        File usersFile = new File(dataFile);
        In inUsers = new In(usersFile);
        
        //each field is separated(delimited) by a '|'
        String delims = "[|]";
        List<User> users = new ArrayList<User>();
        while (!inUsers.isEmpty()) 
        {
            // get user and rating from data source
            String userDetails = inUsers.readLine();
            // parse user details string
            String[] userTokens = userDetails.split(delims);
            // output user data to console.
            if (userTokens.length == 7) 
            {
            	String firstName = userTokens[1];
            	String lastName = userTokens[2];
            	int age = Integer.parseInt(userTokens[3]);
            	char gender = userTokens[4].charAt(0);
            	String occupation = userTokens[5];
            	Long userID = Long.parseLong(userTokens[0]);
            	
                users.add(new User(firstName, lastName, age, gender, occupation, userID));
            }
            
            else
            {
                throw new Exception("Invalid member length: " + userTokens.length);
            }
        }
        return users;
	}
	
	public List<Movie> loadMovies(String dataFile) throws Exception
	{
        File movieFile = new File(dataFile);
        In inMovies = new In(movieFile);
       
        //each field is separated(delimited) by a '|'
        String delims = "[|]";
        List<Movie> movies = new ArrayList<Movie>();
        while (!inMovies.isEmpty()) 
        {
            // get user and rating from data source
            String movieDetails = inMovies.readLine();
            // parse user details string
            String[] movieTokens = movieDetails.split(delims);
            // output user data to console.
            if (movieTokens.length == 23) 
            {
            	Long movieID = Long.parseLong(movieTokens[0]);
            	String title = movieTokens[1];
            	String year = movieTokens[2];
            	String url = movieTokens[3];
            	
            	movies.add(new Movie(title, year, url, movieID));
            }
            
            else
            {
                throw new Exception("Invalid member length: " + movieTokens.length);
            }
        }
        return movies;
	}
	
	public List<Rating> loadRating(String dataFile) throws Exception
	{
        File ratingFile = new File(dataFile);
        In inRating = new In(ratingFile);
        
        //each field is separated(delimited) by a '|'
        String delims = "[|]";
        List<Rating> rating = new ArrayList<Rating>();
        while (!inRating.isEmpty()) 
        {
            // get user and rating from data source
            String ratingDetails = inRating.readLine();

            // parse user details string
            String[] ratingTokens = ratingDetails.split(delims);

            // output user data to console.
            if (ratingTokens.length == 4) 
            {
            	long userID = Long.parseLong(ratingTokens[0]);
            	long movieID = Long.parseLong(ratingTokens[1]);
            	int ratings	= Integer.parseInt(ratingTokens[2]);
            	
            	rating.add(new Rating(userID, movieID, ratings));
            }
            
            else
            {
                throw new Exception("Invalid member length: " + ratingTokens.length);
            }
        }
        return rating;
	}
}
