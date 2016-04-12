package edu.stevens.biz;

import java.util.ArrayList;
import java.util.List;

import edu.stevens.entity.Nation;

public interface NationBiz {

	public ArrayList findAll();
	public Nation findById(int id);
    public Nation findByName(String name);
	
}
