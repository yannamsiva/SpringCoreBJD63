package com.shiva.pojo;

import java.util.List;
import java.util.Set;

public class College {

	private String name;
	
	private List<String> faculties;
	private Set<String> courses;
	private List<Student> students;
	public void setName(String name) {
		this.name = name;
	}
	public void setFaculties(List<String> faculties) {
		this.faculties = faculties;
	}
	public void setCourses(Set<String> courses) {
		this.courses = courses;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	public void displayDetails()
	{
		
		System.out.println("Name of the College : " + name);
		
		System.out.println("Faculty Information : ");
		faculties.forEach(e->System.out.println(e));
		System.out.println("=================================================");
		System.out.println("Course Information : ");
		courses.stream().forEach(e->System.out.println(e));
		System.out.println("=================================================");
		System.out.println("Student Information : ");
		students.stream().forEachOrdered(e->System.out.println(e.getSno()+"\t"+"\t"+e.getSname()+"\t"+e.getSadd()));
	}
	
	
	
	
}
