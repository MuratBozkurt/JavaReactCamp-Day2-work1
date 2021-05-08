package classes;

public class users {
	public users(int id, String username, String passwod) {
		this.id = id;
		this.username = username;
		this.passwod = passwod;
	}

	public users() {}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswod() {
		return passwod;
	}

	public void setPasswod(String passwod) {
		this.passwod = passwod;
	}

	int id;
	String username;
	String passwod;
	
}
