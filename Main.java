import classes.users;
import managers.coursesManager;
import managers.usersManager;
import classes.courses;

public class Main {

	public static void main(String[] args) {
		users firstuser = new users(1,"�lk ��renci" ,"1234");
		users secondUser = new users(2,"�kinci ��renci", "5678");
		courses course = new courses(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp�","JAVA + REACT");
		
		users[] students = {firstuser,secondUser};
		
		for(users temp:students) {System.out.println(temp.getUsername());}
		
		for(users temp:students) {
			System.out.println(usersManager.RegisterUser(temp));
		}
		for(users temp:students) {System.out.println(coursesManager.AddUserToCourse(temp, course));}
	}

}
