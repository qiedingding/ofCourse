package edu.stevens.dao;

import java.util.ArrayList;
import edu.stevens.entity.Nation;

public interface NationDao {
	
	public ArrayList findAll();
	public Nation findById(int id);
	public Nation findByName(String name);
	
}
