package edu.escuelaing.arem.secure.services.servicesImpl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import edu.escuelaing.arem.secure.model.User;
import edu.escuelaing.arem.secure.persistence.UserDAO;
import edu.escuelaing.arem.secure.services.UserServices;

@Service
public class UserServicesImpl implements UserServices {

	@Autowired
	@Qualifier("postgresql")
	private UserDAO userDAO;

	@Override
	public Collection<User> getAllUsers() {
		return this.userDAO.getAllUsers();
	}
	

	@Override
	public User getUser(User u) {
		return this.userDAO.getUser(u);
	}

	@Override
	public void addUser(User u) {
		this.userDAO.addUser(u);

	}
}
