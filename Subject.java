package com.unimelb.swen30006.workshops;

import java.util.ArrayList;

public class Subject {
	
	public String name;
	public String subjectCode;
	public ArrayList<File[]> assignments = new ArrayList<File[]>();
	
	public Subject(String subjectName, String code)
	{
		name = subjectName;
		subjectCode = code;
	}
	
	public void createAssignment(File[] file)
	{
		assignments.add(file);
	}
	
	public void deleteAssignment(String name)
	{
		
	}
	
	

}
