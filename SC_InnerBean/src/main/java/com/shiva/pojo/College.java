package com.shiva.pojo;

import java.util.List;
import java.util.Set;

public class College {

	private String name;
	
	private Student stu;
	
	
	
	
	
	
	public void setName(String name) {
		this.name = name;
	}






	public void setStu(Student stu) {
		this.stu = stu;
	}






	public void displayDetails()
	{
		
		System.out.println("Name of the College : " + name);
		
		System.out.println("Student Information : ");
		System.out.println(stu.getSno()+"\t"+stu.getSname()+"\t"+stu.getSadd());
	}
	
	
	
	
}
