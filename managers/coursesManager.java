package managers;

import classes.courses;
import classes.users;

public class coursesManager {
	
	public static String AddUserToCourse(users user, courses course) {
		return(user.getUsername() + " kullan�c�s� " + course.getCoursename() + " dersine kay�t oldu.");
	}
	
	public static String RemoveUserFromCourse(users user, courses course) {
		return (user.getUsername() + " kullan�c�s� " + course.getCoursename() + " dersinden ��kar�ld�.");
	}
	
}
