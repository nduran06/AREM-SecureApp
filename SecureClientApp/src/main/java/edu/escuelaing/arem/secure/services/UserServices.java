package edu.escuelaing.arem.secure.services;

import java.util.Collection;

import edu.escuelaing.arem.secure.model.User;

public interface UserServices {

	public Collection<User> getAllUsers();

	public User getUser(User u);
	
	public void addUser(User u);

}
