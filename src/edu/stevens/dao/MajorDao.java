package edu.stevens.dao;

import java.util.ArrayList;


import edu.stevens.entity.Major;
import edu.stevens.entity.Nation;
import edu.stevens.entity.School;

public interface MajorDao {
	
	public ArrayList findAll();
	public Major findById(int id);
	public Major findByCode(int id);
	public Major findByName(String name);
	
}
