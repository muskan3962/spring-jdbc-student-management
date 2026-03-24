package com.springjdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;
	@Override
	public int insert(Student student) {
		 String query ="insert into student(id,name,city) values(?,?,?)";
		 int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}
	@Override
	public int change(Student student) {
		//update query
		String query = "update student set name =?,city =? where id =?";
		int r = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}
	@Override
	public int delete(int studentId) {
		// delete 
		String query = "delete from student where id =?";
		int res = this.jdbcTemplate.update(query,studentId);
		return res;
	}
	@Override
	public Student getSudent(int studentId) {
		// select single student data
		String query = "select *from student where id =?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student =this.jdbcTemplate.queryForObject(query,rowMapper,studentId);
		return student;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	


	

}
