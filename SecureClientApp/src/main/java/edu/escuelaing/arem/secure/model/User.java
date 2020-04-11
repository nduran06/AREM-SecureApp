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
	
	/**
	 * Get the username of an user
	 * @return username
	 */
	public String getUser() {
		return user;
	}
	
	/**
	 * Set the username of a given user
	 * @param user User
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * Get the password of an user
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Set the password of an user
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	
	/**
	 * Get the token of an user
	 * @return token
	 */
	public String getToken() {
		return token;
	}

	
	/**
	 * Set the token of an user
	 * @param token
	 */
	public void setToken(String token) {
		this.token = token;
	}

}