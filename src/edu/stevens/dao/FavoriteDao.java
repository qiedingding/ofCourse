package edu.stevens.dao;

import java.util.ArrayList;

import edu.stevens.entity.Course;
import edu.stevens.entity.Custom;
import edu.stevens.entity.Favorite;

public interface FavoriteDao {
	
	public ArrayList findAll();
	public Favorite findById(int id);
	public boolean update(Favorite favorite);
	public boolean delete(Favorite favorite);
	public boolean insert(Favorite favorite);
	
}
