package lms;

import java.util.Date;

public class Person {
	
	public String name;
	public Date dob;
	public String address;
	public Subject[] subjects;
	
	public Person(String name, Date dob, String address) {
		this.name = name;
		this.dob = dob;
		this.address = address;
	}

}
