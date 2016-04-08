package edu.stevens.biz;

import java.util.ArrayList;
import java.util.List;

import edu.stevens.entity.Custom;

public interface CustomBiz {

	public ArrayList findAll();
	public Custom findById(int id);
	public boolean update(Custom custom);
	public boolean delete(Custom custom);
	public boolean validate_user(Custom custom);
}
