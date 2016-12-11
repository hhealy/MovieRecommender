package models;


import static org.junit.Assert.*;
import static models.ModelTest.users;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UserTest 
{

	@Before
	public void setUp() throws Exception 
	{
		
	}
	
	@Test
	public void getUserIDTest() 
	{
		assertEquals(1, users[0].getUserID(), 0.01);
		assertEquals(2, users[1].getUserID(), 0.01);
		assertEquals(3, users[2].getUserID(), 0.01);
		assertNotEquals(2, users[0].getUserID(), 0.01);
		assertNotEquals(10, users[1].getUserID(), 0.01);
	}
	
	@Test
	public void getFirstNameTest()
	{
		assertEquals("Henry", users[0].getFirstName());
		assertEquals("Murey", users[1].getFirstName());
		assertEquals("Enda", users[2].getFirstName());
		assertNotEquals("Amy", users[1].getFirstName());
		assertNotEquals("Chris", users[0].getFirstName());
	}
	
	@Test
	public void getLastNameTest()
	{
		assertEquals("Healy", users[0].getLastName());
		assertEquals("Healy", users[1].getLastName());
		assertEquals("Kenny", users[2].getLastName());
		assertNotEquals("Robinson", users[1].getLastName());
		assertNotEquals("Smith", users[0].getLastName());
	}
	
	@Test
	public void getAgeTest()
	{
		assertEquals(21, users[0].getAge());
		assertEquals(55, users[1].getAge());
		assertEquals(60, users[2].getAge());
		assertNotEquals(100, users[1].getAge());
		assertNotEquals(-6, users[0].getAge());
	}
	
	//@Test
	public void getGenderTest()
	{
		assertEquals('M', users[0].getGender());
		assertEquals('F', users[1].getGender());
		assertEquals('M', users[2].getGender());
		assertNotEquals('F', users[2].getGender());
		assertNotEquals('M', users[0].getGender());
	}
	
	@Test
	public void getOccupationTest()
	{
		assertEquals("student".toLowerCase(), users[0].getOccupation());
		assertEquals("pharmacist".toLowerCase(), users[1].getOccupation());
		assertEquals("Taoiseach".toLowerCase(), users[2].getOccupation());
		assertNotEquals("other".toLowerCase(), users[2].getOccupation());
		assertNotEquals("engineer".toLowerCase(), users[0].getOccupation());
	}	

	@After
	public void tearDown() throws Exception 
	{
		
	}
}