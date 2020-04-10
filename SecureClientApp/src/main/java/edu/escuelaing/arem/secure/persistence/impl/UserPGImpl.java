package edu.escuelaing.arem.secure.persistence.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import edu.escuelaing.arem.secure.model.User;
import edu.escuelaing.arem.secure.persistence.UserDAO;


@Repository("postgresql")
public class UserPGImpl implements UserDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	/**
	 * Database mapper
	 *
	 */
	private static class UserRowMapper implements RowMapper<User> {

		@Override
		public User mapRow(ResultSet resultSet, int i) throws SQLException {
			User user = new User();
			user.setUser(resultSet.getString("correo"));
			user.setPassword(resultSet.getString("passwd"));

			return user;
		}
	}
	

	/**
	 * Get all users on database
	 */
	@Override
	public Collection<User> getAllUsers() {
		final String sql = "SELECT * FROM pt_user";
		List<User> users = jdbcTemplate.query(sql, new UserRowMapper());
		return users;
	}
	
	/**
	 * Get an user on database
	 */
	@Override
	public User getUser(User user) {
		final String sql = "SELECT * FROM pt_user where correo=(?) and passwd=(?)";
		User userDB=jdbcTemplate.queryForObject(sql,new Object[]{user.getUser(), user.getPassword()}, new UserRowMapper());
		return userDB;
	}
	
	
	/**
	 * Add a new user to database
	 */
	@Override
	public void addUser(User user) {
        final String sql = "INSERT INTO pt_user (correo, passwd) VALUES (?, ?)";		
        final String username = user.getUser();
        final String passwd = user.getPassword();
        
        jdbcTemplate.update(sql, new Object[]{username, passwd});
	
	}


}