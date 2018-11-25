package com.action;

import java.util.List;

import com.pojo.Student;
import com.service.StudentService;

public class StudentAction {

	StudentService studentService;
	List<Student> students;
	Student student;

	public String list() {
		students = studentService.list();
		return "listStudent";
	}
	
	public String add(){
		studentService.add(student);
		return "listStudentAction";
	}
	public String edit(){
		student = studentService.get(student.getId());
		return "editStudent";
	}
	public String delete(){
		studentService.delete(student);
		return "listStudentAction";
	}
	public String update(){
		studentService.update(student);
		return "listStudentAction";
	}

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	 

}
