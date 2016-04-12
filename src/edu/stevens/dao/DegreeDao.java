package edu.stevens.dao;

import java.util.ArrayList;

import edu.stevens.entity.Degree;
import edu.stevens.entity.Nation;

public interface DegreeDao {
	
	public ArrayList findAll();
	public Degree findById(int id);
	public Degree findByName(String name);
	
}
