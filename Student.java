package lms;

import java.util.Date;

public class Student extends Person {
	public String studentID;
	public String email;
	
	public Student(String name, Date dob, String address, String studentID, String email) {
		super(name, dob, address);
		this.studentID = studentID;
		this.email = email;
	}
	
	public void sendEmailMsg(String msg) {
		
	}
	
	public float totalGrade() {
		return 0;
	}
}
