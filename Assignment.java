package com.unimelb.swen30006.workshops;

import java.util.ArrayList;
import java.util.Date;

public class Assignment implements SubmissionValidator{
	
	public String name;
	public String description;
	public Date dueDate;
	public int maxAttempts; 
	private int assignmentID;
	public Submission[] valid;
	public Submission[] invalid;
	public ArrayList<File[]> submitted = new ArrayList<File[]>();
	
	public void createSubmission(int ID, File[] files)
	{
		assignmentID = ID;
		submitted.add(files);
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
			return valid;
			
	}
	
	public Submission[] invalidSubmissions()
	{
		return invalid;
	}
	
	public ValidationError[] validateSubmission(Submission submission)
	{
		ArrayList<ValidationError> errors = new ArrayList<ValidationError>();
	        
    @Override
    public ValidationError[] validateSubmission(Submission submission) {
        ArrayList<ValidationError> errors = new ArrayList<ValidationError>();
        // Loop through all files and create an error if there's plagiarism
        File[] files = submission.includedFiles();
        int size = files.length;
        for (int i=0; i<(size-1);i++) {
        	for (int j =i+1; j<size;j++) {
        		if (files[i].content().equals(files[j].content())){
        			ValidationError error = new ValidationError(files[i]);
        			error.addError("Plagiarism", "Plagiarism detected.");
        			errors.add(error);
        		}
        	}
        	
        }

	    if(errors.size() > 0)
	    {
	    	return errors.toArray(new ValidationError[0]);
	    
	    } else {
	        
	    	return null;
	    }
	}
}
