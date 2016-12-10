package controllers;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
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
            	String gender = userTokens[4];
            	String occupation = userTokens[5];
            	double userID = double.parseDouble(userTokens[0]);
            	
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
            if (movieTokens.length == 7) 
            {
                System.out.println("ID: "+ movieTokens[0]+",First Name:"+
                		movieTokens[1]+",Surname:" + movieTokens[2]+",Age:"+
                        Integer.parseInt(movieTokens[3])+",Gender:"+ movieTokens[4]+",Occupation:"+
                        movieTokens[5]);
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
            if (ratingTokens.length == 7) 
            {
                System.out.println("UserID: "+ ratingTokens[0]+",First Name:"+
                		ratingTokens[1]+",Surname:" + ratingTokens[2]+",Age:"+
                        Integer.parseInt(ratingTokens[3])+",Gender:"+ ratingTokens[4]+",Occupation:"+
                        ratingTokens[5]);

            }
            
            else
            {
                throw new Exception("Invalid member length: " + ratingTokens.length);
            }
        }
        return rating;
	}
}
