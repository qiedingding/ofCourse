package edu.stevens.biz;

import java.util.ArrayList;
import java.util.List;

import edu.stevens.entity.Major;
import edu.stevens.entity.Nation;
import edu.stevens.entity.School;

public interface MajorBiz {

	public ArrayList findAll();
	public Major findById(int id);
	public Major findByCode(int id);
    public Major findByName(String name);
	
}
