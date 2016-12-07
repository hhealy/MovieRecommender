package models;

public class User 
{
	public String firstName;
	public String lastName;
	public int age;
	public String gender;
	public String occupation;
	public double userID;
	
	public User(String firstName, String lastName, int age, String gender, String occupation, double userID)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.occupation = occupation;
		this.userID = userID;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getGender()
	{
		return gender;
	}
	
	public String getOccupation()
	{
		return occupation;
	}
	
	public double getUserID()
	{
		return userID;
	}
}
