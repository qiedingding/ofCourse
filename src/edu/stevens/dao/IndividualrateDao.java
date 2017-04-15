		package edu.stevens.dao;

import java.util.ArrayList;

import edu.stevens.entity.Course;
import edu.stevens.entity.Custom;
import edu.stevens.entity.Individualrate;

public interface IndividualrateDao {
	
	public ArrayList findAll();
	public Individualrate findById(int id);
	public boolean update(Individualrate individualrate);
	public boolean delete(Individualrate individualrate);
	public boolean insert(Individualrate individualrate);
	public ArrayList findByUserId(int id);
	public Individualrate findByUserIdAndCourseId(int userId, int courseId);
	public ArrayList findByCourseId(int courseId);
}
