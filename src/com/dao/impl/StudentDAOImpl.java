package com.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.dao.StudentDAO;
import com.pojo.Student;

public class StudentDAOImpl extends HibernateTemplate implements StudentDAO{
	
	public List<Student> list() {
		return find("from Student");
	}

	@Override
	public void add(Student p) {
		save(p);
	}

	@Override
	public Student get(int id) {
		return (Student)get(Student.class,id);
	}

	@Override
	public void update(Student p) {
		super.update(p);
		
	}

	@Override
	public void delete(Student p) {
		super.delete(p);
	}
	
}
