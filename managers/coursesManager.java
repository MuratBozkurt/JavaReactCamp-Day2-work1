package managers;

import classes.courses;
import classes.users;

public class coursesManager {
	
	public static String AddUserToCourse(users user, courses course) {
		return(user.getUsername() + " kullanıcısı " + course.getCoursename() + " dersine kayıt oldu.");
	}
	
	public static String RemoveUserFromCourse(users user, courses course) {
		return (user.getUsername() + " kullanıcısı " + course.getCoursename() + " dersinden çıkarıldı.");
	}
	
}
