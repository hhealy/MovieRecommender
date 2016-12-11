package models;

public class Movie 
{
	public String name;
	public String year;
	public String url;
	public long movieID;
	
	public Movie(long movieID, String name, String year, String url)
	{
		this.name = name;
		this.year = year;
		this.url = url;
		this.movieID = movieID;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getYear()
	{
		return year;
	}
	
	public String getUrl()
	{
		return url;
	}
	
	public long getMovieID()
	{
		return movieID;
	}
	
	public String toString()
	{
		return "ID = " + movieID + " Title = " + name;
	}
}
