package com.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmpDao {
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int save(Emp p) {
		String sql = "insert into Emp(ename,eemail,epassword,esalary) values('" + p.getEname() + "','" + p.getEemail()
				+ "','" + p.getEpassword() + "','" + p.getEsalary() + "')";
		return template.update(sql);
	}

	public int update(Emp p) {
		String sql = "update Emp set ename='" + p.getEname() + "', eemail='" + p.getEemail() + "', epassword='"
				+ p.getEpassword() + "',esalary='" + p.getEsalary() + "' where eid=" + p.getEid() + "";
		return template.update(sql);
	}

	public int delete(int eid) {
		String sql = "delete from Emp where eid=" + eid + "";
		return template.update(sql);
	}

	public Emp getEmpById(int eid) {
		String sql = "select * from Emp where eid=?";
		return template.queryForObject(sql, new Object[] { eid }, new BeanPropertyRowMapper<Emp>(Emp.class));
	}

	public List<Emp> getEmployees() {
		return template.query("select * from Emp", new RowMapper<Emp>() {
			public Emp mapRow(ResultSet rs, int row) throws SQLException {
				Emp e = new Emp();
				e.setEid(rs.getInt(1));
				e.setEname(rs.getString(2));
				e.setEemail(rs.getString(3));
				e.setEpassword(rs.getString(4));
				e.setEsalary(rs.getString(5));
				return e;
			}
		});
	}
}
