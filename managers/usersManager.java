package managers;

import classes.users;

public class usersManager {
	
	public static String RegisterUser(users user) {
		return (user.getUsername() + " kullan�c�s� kay�t edildi.");
	}
	
	public static String DeleteUser(users user) {
		return (user.getUsername() + " kullan�c�s� silindi.");
	}

}
