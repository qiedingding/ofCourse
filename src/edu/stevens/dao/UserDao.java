package edu.stevens.dao;

import java.util.ArrayList;

import edu.stevens.entity.Custom;
import edu.stevens.entity.User;

public interface UserDao {
	
	public ArrayList findAll();
	public User findById(int id);
	public boolean update(User user);
	public User findByUserNameAndPwd(User user);
	public boolean delete(User user);
	public boolean validate_user(User user);
	
}
