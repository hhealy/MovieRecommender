package models;

public class User 
{
	public String firstName;
	public String lastName;
	public int age;
	public char gender;
	public String occupation;
	public long userID;
	
	public User(String firstName, String lastName, int age, char gender, String occupation, long userID)
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
	
	public char getGender()
	{
		return gender;
	}
	
	public String getOccupation()
	{
		return occupation;
	}
	
	public long getUserID()
	{
		return userID;
	}
	
	public String toString()
	{
		return "Name = " + firstName + " " + lastName + " Gender = " + gender + " Age = " + age + " Occupation = " + occupation + "ID = " + userID;
	}
}
