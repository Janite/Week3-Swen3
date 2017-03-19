package lms;

import java.util.ArrayList;

public class Subject {
	
	public String name;
	public String subjectCode;
	public ArrayList<Assignment> assignments;
	
	public Subject(String subjectName, String code)
	{
		name = subjectName;
		subjectCode = code;
		this.assignments = new ArrayList<Assignment>();
	}
	
	public Assignment createAssignment(String name, String description, int date, int attempts)
	{
		Assignment created = new Assignment(name, description, date, attempts);
		assignments.add(created);
		return created;
		
	}
	
	public void deleteAssignment(String name)
	{
		
	}
	
	

}
