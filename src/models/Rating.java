package models;

public class Rating 
{
	public long userID;
	public long movieID;
	public int rating;
	
	public Rating(long movieID, long userID, int rating)
	{
		this.userID = userID;
		this.movieID = movieID;
		this.rating = rating;
	}
	
	public long getUserID()
	{
		return userID;
	}
	
	public long getMovieID()
	{
		return movieID;
	}
	
	public int getRating()
	{
		return rating;
	}
	
	public String toString()
	{
		return "UserID =" + userID + " MovieID = " + movieID + " Rating = " + rating;
	}
}
