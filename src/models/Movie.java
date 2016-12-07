package models;

public class Movie 
{
	public String name;
	public int year;
	public String url;
	public double movieID;
	
	public Movie(String name, int year, String url, double movieID)
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
	
	public int getYear()
	{
		return year;
	}
	
	public String getUrl()
	{
		return url;
	}
	
	public double movieID()
	{
		return movieID;
	}
}
