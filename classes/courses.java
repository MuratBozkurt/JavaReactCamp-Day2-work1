package classes;

public class courses {
	public courses(int id, String coursename, String courseTopic) {
		super();
		this.id = id;
		this.coursename = coursename;
		this.courseTopic = courseTopic;
	}
	public courses() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getCourseTopic() {
		return courseTopic;
	}
	public void setCourseTopic(String courseTopic) {
		this.courseTopic = courseTopic;
	}
	int id;
	String coursename;
	String courseTopic;

}
