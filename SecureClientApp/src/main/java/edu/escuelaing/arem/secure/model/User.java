package edu.escuelaing.arem.secure.model;

public class User {

	private String user;
	private String password;
	private String token;
	
	public User() {
		
	}
	
	public User(String user, String password) {
		this.user=user;
		this.password=password;
	}
	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}