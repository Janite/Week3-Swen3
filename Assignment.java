package lms;

import java.util.ArrayList;
import java.util.Date;

public class Assignment {
	
	public String name;
	public String description;
	public int dueDate;
	public int maxAttempts; 
	public ArrayList<Submission> valid = new ArrayList<Submission>();
	public ArrayList<Submission> invalid = new ArrayList<Submission>();
	public ArrayList<Submission> submitted = new ArrayList<Submission>();
	
	public void createSubmission(Student student, File[] file)
	{
		Submission newSubmission = new Submission(student, file);
		submitted.add(newSubmission);
	}
	
	public Assignment(String name, String description, int dueDate, int maxAttempts)
	{
		this.name = name;
		this.description = description;
		this.dueDate = dueDate;
		this. maxAttempts = maxAttempts;
	}
	
	public ArrayList<Submission> validSubmissions()
	{
		Validator validator = new Validator();
		for(Submission sub : submitted) {
			if(validator.validateSubmission(sub)==null) {
				valid.add(sub);
			}
		}
		return valid;
			
	}
	
	public ArrayList<Submission> invalidSubmissions()
	{
		Validator validator = new Validator();
		for(Submission sub : submitted) {
			if(validator.validateSubmission(sub)!=null) {
				invalid.add(sub);
			} 
		}
		return invalid;
	}
	
}
