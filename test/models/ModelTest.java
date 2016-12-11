package models;

import models.Movie;
import models.Rating;
import models.User;

public class ModelTest 
{

	public static User[] users =
	{
		new User("Henry", "Healy", 21, 'M', "student", 1l),
		new User("Murey", "Healy", 55, 'F', "pharmacist", 2l),
		new User("Enda", "Kenny", 60, 'M', "taoiseach", 3l)
	};
	
	public static Movie[] movies =
	{
			new Movie(23l, "Batman Begins", "2005", "http://www.imdb.com/title/tt0372784/?ref_=nv_sr_3"),
			new Movie(22, "The Dark Knight", "2008", "http://www.imdb.com/title/tt0468569/?ref_=nv_sr_1"),
			new Movie(24l, "The Dark Knight Rises", "2012", "http://www.imdb.com/title/tt1345836/?ref_=tt_rec_tt"),
			new Movie(42l, "Inception", "2010", "http://www.imdb.com/title/tt1375666/?ref_=tt_rec_tt"),
			new Movie(54l, "Disturbia", "2007", "http://www.imdb.com/title/tt0486822/?ref_=nv_sr_1")
	};
	
	public static Rating[] ratings =
	{
			new Rating(12345l, 12l, 1),
			new Rating(23456l, 13l, 4),
			new Rating(34567l, 14l, -1),
			new Rating(45678l, 15l, 0)
	};
}