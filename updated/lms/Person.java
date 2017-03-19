package lms;

import java.util.Date;

public class Person {
	
	public String name;
	public int dob;
	public String address;
	public Subject[] subjects;
	
	public Person(String name, int dob, String address) {
		this.name = name;
		this.dob = dob;
		this.address = address;
	}

}
