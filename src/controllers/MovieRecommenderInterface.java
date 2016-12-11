package controllers;

public interface MovieRecommenderInterface 
{
	//Add a user to the program.
	public void addUser(String firstName, String lastName, int age, char gender, String occupation);
	
	//Remove a user from the program.
	public void removeUser(long userID);
	
	//Add a movie to the program.
	public void addMovie(String title, int year, String url);
	
	//Add a movie rating to the program.
	public void addRating(long userID, long movieID, int rating);
	
	//Returns the name of a movie.
	public String getMovie(long movieID);
	
	//Returns the user rating of a movie.
	public int getUserRating(long userID);
	
	//Returns the user recommendations.
	public String getUserRecommendation(long userID);
	
	//Returns the top ten movies.
	public String getTopTenMovies();
	
	//Load from the serializer
	public void load();
	
	//Write to the serializer
	public void write();
}
