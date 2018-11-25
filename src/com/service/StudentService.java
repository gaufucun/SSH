package com.service;

import java.util.List;

import com.pojo.Student;

public interface StudentService {
	
	public List<Student> list();
	public void add(Student p);
	public Student get(int id);
	public void update(Student p);
	public void delete(Student p);
}
