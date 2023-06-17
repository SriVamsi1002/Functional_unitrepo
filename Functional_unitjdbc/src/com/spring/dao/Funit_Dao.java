package com.spring.dao;

import java.util.List;

import com.spring.model.FunitModel;

public interface Funit_Dao {
	List<FunitModel> getfunitbyid(Integer modl_id);

	void createmodel(int modl_id, int funit_id);

}
