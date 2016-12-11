package controllers;

import models.User;
import models.Movie;
import models.Rating;
import controllers.DataLoader;
import utils.Serializer;
import utils.SerializerInterface;
import asg.cliche.Command;
import asg.cliche.Param;
import asg.cliche.ShellFactory;
import asg.cliche.*;


public class Main 
{
	public static void main(String [] args) throws Exception
	{
		Main main = new Main();
		Shell shell = ShellFactory.createConsoleShell("mr", "Welcome to MovieRecommender", main);
		shell.commandLoop();
		main.save();
	}
	
	public void save() throws Exception
	{
		movieRecommender.write();
	}
	
	public MovieRecommenderAPI movieRecommender;
	
	@Command(description = "Add a user")
	public void addUser (@Param(name = "First name") String firstName, @Param(name = "Last Name") String lastName, @Param(name = "Age") int age, 
						 @Param(name = "Gender") char gender, @Param(name = "Occupation") String occupation)
	{
		movieRecommender.addUser(userID, firstName, lastName, age, gender, occupation);
		System.out.println("User has been removed");
	}
	
	@Command(description = "Remove a user")
	public void removerUser	(@Param(name = "User ID") Long userID)
	{
		movieRecommender.removeUser(userID);
		System.out.println("Movie has been removed");
	}
	
	@Command(description = "Add a movie")
	public void addMovie (@Param(name="title") String title, @Param(name="year") String year, @Param(name="url") String url)
	{
		movieRecommender.addMovie(movieID, title, year, url);
		System.out.println("Movie has been added");
	}
}
