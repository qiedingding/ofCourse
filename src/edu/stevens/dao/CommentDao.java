package edu.stevens.dao;

import java.util.ArrayList;

import edu.stevens.entity.Comment;
import edu.stevens.entity.Course;
import edu.stevens.entity.Custom;

public interface CommentDao {
	
	public ArrayList findAll();
	public Comment findById(int id);
	public boolean update(Comment comment);
	public boolean delete(Comment comment);
	public boolean insert(Comment comment);
	
}
