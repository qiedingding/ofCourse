package edu.stevens.biz;

import java.util.ArrayList;
import java.util.List;

import edu.stevens.entity.Comment;
import edu.stevens.entity.Course;
import edu.stevens.entity.Custom;

public interface CommentBiz {
	
	public ArrayList findAll();
	public Comment findById(int id);
	public boolean update(Comment comment);
	public boolean delete(Comment comment);
	public boolean insert(Comment comment);
	
}
