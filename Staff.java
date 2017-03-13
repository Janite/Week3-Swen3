package lms;

import java.util.Date;

public class Staff extends Person {
	public String staffID;
	public String[] roles;
	
	public Staff(String name, Date dob, String address, String staffID, String[] roles) {
		super(name, dob, address);
		this.staffID = staffID;
		this.roles = roles;
	}
}
