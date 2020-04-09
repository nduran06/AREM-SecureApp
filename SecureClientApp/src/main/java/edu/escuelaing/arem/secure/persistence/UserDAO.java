package edu.escuelaing.arem.secure.persistence;

import java.util.Collection;

import edu.escuelaing.arem.secure.model.User;

public interface UserDAO {
	
	/**
	 * Method that returns a collection of all users
	 * @return Collection of users
	 */
	public Collection<User> getAllUsers();
	
	/**
	 * Returns an user if it exits on db
	 * @param user
	 * @return User
	 */
	public User getUser(User user);
	
	
	
	/**
	 * Method to add a new user
	 * @param user New user
	 */
	public void addUser(User user);
	
	

}