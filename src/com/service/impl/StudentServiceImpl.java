package com.service.impl;

import java.util.List;

import com.dao.StudentDAO;
import com.pojo.Student;
import com.service.StudentService;

public class StudentServiceImpl implements StudentService {

	StudentDAO studentDAO;

	public List<Student> list() {
		List<Student> students= studentDAO.list();
		if(students.isEmpty()){
			for (int i = 0; i < 5; i++) {
				Student p = new Student();
				p.setName("student " + i);
				studentDAO.add(p);
				students.add(p);
			}
		}
		return students;
	}

	public StudentDAO getStudentDAO() {
		return studentDAO;
	}

	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

	@Override
	public void add(Student p) {
		studentDAO.add(p);
		
	}



	@Override
	public void update(Student p) {
		studentDAO.update(p);
	}

	@Override
	public void delete(Student p) {
		studentDAO.delete(p);
	}

	@Override
	public Student get(int id) {
		return studentDAO.get(id);
	}

	
}
