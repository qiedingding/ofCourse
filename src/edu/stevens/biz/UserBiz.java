package edu.stevens.biz;

import java.util.ArrayList;
import java.util.List;

import edu.stevens.entity.User;

public interface UserBiz {

	public ArrayList findAll();
	public User findById(int id);
	public boolean update(User user);
	public boolean delete(User user);
	public boolean validate_user(User user);
	public User login(User user);
}
