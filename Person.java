package lms;

import java.util.ArrayList;
import java.util.Date;

public class Person {
	
	public String name;
	public int dob;
	public String address;
	public ArrayList<Subject> subjects;
	
	public Person(String name, int dob, String address) {
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.subjects = new ArrayList<Subject>();
	}
	
	public void addSubject(Subject subject) {
		subjects.add(subject);
	}

}
