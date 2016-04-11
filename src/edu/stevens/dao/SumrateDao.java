package edu.stevens.dao;

import java.util.ArrayList;

import edu.stevens.entity.Course;
import edu.stevens.entity.Custom;
import edu.stevens.entity.Sumrate;

public interface SumrateDao {
	
	public ArrayList findAll();
	public Sumrate findById(int id);
	public boolean update(Sumrate sumrate);
	public boolean delete(Sumrate sumrate);
	public boolean insert(Sumrate sumrate);
	
}
