package com.unimelb.swen30006.workshops;

import java.util.ArrayList;
import java.util.Date;

public class Assignment implements SubmissionValidator{
	
	public String name;
	public String description;
	public Date dueDate;
	public int maxAttempts; 
	public ArrayList<Submission[]> valid = new ArrayList<Submission[]>();
	public ArrayList<Submission[]> invalid = new ArrayList<Submission[]>();
	public ArrayList<Submission[]> submitted = new ArrayList<Submission[]>();
	
	public void createSubmission(Student student, File[] files)
	{
		Submission newSubmission = new Submission(files, student.studentID);
		submitted.add(newSubmission);
	}
	
	public Assignment(String name, String description, Date dueDate, int maxAttempts)
	{
		this.name = name;
		this.description = description;
		this.dueDate = dueDate;
		this. maxAttempts = maxAttempts;
	}
	
	public Submission[] validSubmissions()
	{
		for(	
		return validSubmissions;
			
	}
	
	public Submission[] invalidSubmissions()
	{
		return invalidSubmissions;
	}
	
	        
    @Override
    public ValidationError[] validateSubmission(Submission[] submissions) {
        ArrayList<ValidationError> errors = new ArrayList<ValidationError>();
        // Loop through all files and create an error if there's plagiarism
        File[] files = submissions;
        int size = files.length;
        for (int i=0; i<(size-1);i++) {
        	for (int j =i+1; j<size;j++) {
        		if (files[i].content().equals(files[j].content())){
        			ValidationError error = new ValidationError(files[i]);
        			error.addError("Plagiarism", "Plagiarism detected.");
        			errors.add(error);
				invalidSubmissions.add(files[i]);
				invalidSubmissions.add(files[j]);
        		} 
        	} 
		validSubmissions(files[i]);
        	
        }

	    if(errors.size() > 0)
	    {
		System.out.println(errors[0]);
	    	return errors.toArray(new ValidationError[0]);
	    
	    } else {
	        
	    	return null;
	    }
	}
}
