package com.spring.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.model.FunitModel;
import com.spring.model.Funit_mapper;

@Component
public class Funit_Dao_impl implements Funit_Dao {
	JdbcTemplate jdbcTemplate;
	private String sql = "select * from vamsi_functional_units";
	private String sql2 = "insert into vamsi_functional_units values(?,?)";

	@Autowired
	public Funit_Dao_impl(DataSource dataSource) {
		System.out.println("came herer");
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<FunitModel> getfunitbyid(FunitModel f) {
		ArrayList<FunitModel> fu = new ArrayList<>();
		// return fu;

		return jdbcTemplate.query(sql, new Funit_mapper());
	}

	@Override
	public void createmodel(int modl_id, int funit_id) {

		jdbcTemplate.update(sql2, modl_id, funit_id);
		// TODO Auto-generated method stub

	}

	// public void createmodel(int modl_id, int funit_id) {
	// try {
	// PreparedStatement ps = c.prepareStatement("insert into vamsi_functional_units values(?,?)",
	// ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
	// ps.setInt(1, modl_id);
	// ps.setInt(2, funit_id);
	// ps.execute();
	// System.out.println("insertion completed");
	//
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }
}
