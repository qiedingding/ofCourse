package edu.stevens.biz;

import java.util.ArrayList;
import java.util.List;

import edu.stevens.entity.Nation;
import edu.stevens.entity.School;

public interface SchoolBiz {

	public ArrayList findAll();
	public School findById(int id);
    public School findByName(String name);
	
}
