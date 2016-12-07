package models;

public class Rating 
{
	public double userID;
	public double movieID;
	public int rating;
	
	public Rating(double movieID, double userID, int rating)
	{
		this.userID = userID;
		this.movieID = movieID;
		this.rating = rating;
	}
	
	public double getUserID()
	{
		return userID;
	}
	
	public double getMovieID()
	{
		return movieID;
	}
	
	public int getRating()
	{
		return rating;
	}
}
