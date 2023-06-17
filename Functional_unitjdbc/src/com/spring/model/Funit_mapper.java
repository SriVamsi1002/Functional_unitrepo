package com.spring.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Funit_mapper implements RowMapper<FunitModel> {

	public Funit_mapper() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public FunitModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		FunitModel f = new FunitModel();
		f.setModl_id(rs.getInt("modl_id"));
		f.setFun_id(rs.getInt("funt_id"));
		return f;
	}

}
