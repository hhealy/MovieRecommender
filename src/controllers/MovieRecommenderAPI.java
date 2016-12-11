package controllers;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import models.Movie;
import models.Rating;
import models.User;
import utils.SerializerInterface;
import utils.Serializer;

public class MovieRecommenderAPI implements MovieRecommenderInterface
{
	public Map<Long, User> userIndex = new HashMap<>();
	public Map<Long, Movie> movieIndex = new HashMap<>();
	public Map<Long, Rating> ratingIndex = new HashMap<>();
	
	public File data = new File("data.xml");
	public Serializer serializer = new Serializer(data);
	
	public MovieRecommenderAPI()
	{
		
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
	public void write() throws Exception
	{
		serializer.push(userIndex);
		serializer.push(movieIndex);
		serializer.push(ratingIndex);
		serializer.write();
	}

	@Override
	public void load() throws Exception
	{
		if (data.isFile())
		{
			serializer.read();	
			ratingIndex = (Map<Long, Rating>) serializer.pop();
			movieIndex = (Map<Long, Movie>) serializer.pop();
			userIndex = (Map<Long, User>) serializer.pop();
		}
		
		else
		{
			DataLoader loader = new DataLoader();
			
			List <User> users = loader.loadUsers("moviedata_small/users5.dat");
			for (User user : users)
			{
				userIndex.put(user.getUserID(), user);
			}
			
			List <Movie> movies = loader.loadMovies("moviedata_small/items5.dat");
			for (Movie movie : movies)
			{
				movieIndex.put(movie.getMovieID(), movie);
			}
		}
	}
}
