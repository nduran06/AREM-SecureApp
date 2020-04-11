package edu.escuelaing.arem.secure.services;

import java.util.Collection;

import edu.escuelaing.arem.secure.model.User;

public interface UserServices {

	/**
	 * Get a collection of all users on database
	 * @return A Collection of users
	 */
	public Collection<User> getAllUsers();

	/**
	 * Get a user on database
	 * @param u External user 
	 * @return A user that is on database; null otherwise
	 */
	public User getUser(User u);
	
	/**
	 * Add a new user to database
	 * @param u New user
	 */
	public void addUser(User u);

}
