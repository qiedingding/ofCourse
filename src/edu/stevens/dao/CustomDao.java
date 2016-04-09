package edu.stevens.dao;

import java.util.ArrayList;

import edu.stevens.entity.Custom;

public interface CustomDao {
	
	public ArrayList findAll();
	public Custom findById(int id);
	public boolean update(Custom custom);
	public boolean delete(Custom custom);
	public boolean validate_user(Custom custom);
	
}
