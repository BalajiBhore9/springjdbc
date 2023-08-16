package com.springcore.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springcore.jdbc.entites.Student;

public class StudentDaoImpl implements StudentDao{

	public JdbcTemplate jdbcTemplate;
	
	public int insert(Student student) {

		//Insert Query
		String query = "insert into student(id,name,city) value(?,?,?)";
		int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}
	public int update(Student student) {

		//Update Data 
		String updateQuery = "update student set name=? city=? where id=?";
		int uddateresult = jdbcTemplate.update(updateQuery,student.getName(),student.getCity(),student.getId());
		return uddateresult;
	}
	public int delete(int studentID) {
		//Delete Data
		String deleteQuery = "delete from student where id=?";
		int r = jdbcTemplate.update(deleteQuery,studentID);
		return r;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
}
