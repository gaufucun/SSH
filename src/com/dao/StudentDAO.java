package com.dao;

import java.util.List;

import com.pojo.Student;
public interface StudentDAO {
	
	public List<Student> list();
	public void add(Student p);
	public Student get(int id);
	public void update(Student p);
	public void delete(Student p);	
}
