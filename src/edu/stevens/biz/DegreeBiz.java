package edu.stevens.biz;

import java.util.ArrayList;
import java.util.List;

import edu.stevens.entity.Degree;
import edu.stevens.entity.Nation;

public interface DegreeBiz {

	public ArrayList findAll();
	public Degree findById(int id);
    public Degree findByName(String name);
	
}
