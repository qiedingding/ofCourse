package edu.stevens.dao;

import java.util.ArrayList;

import edu.stevens.entity.Nation;
import edu.stevens.entity.School;

public interface SchoolDao {
	
	public ArrayList findAll();
	public School findById(int id);
	public School findByName(String name);
	
}
