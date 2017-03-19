package lms;

import java.util.ArrayList;
import java.util.Date;

public class Assignment implements SubmissionValidator{
	
	public String name;
	public String description;
	public int dueDate;
	public int maxAttempts; 
	public ArrayList<Submission> valid = new ArrayList<Submission>();
	public ArrayList<Submission> invalid = new ArrayList<Submission>();
	public ArrayList<Submission> submitted = new ArrayList<Submission>();
	
	public void createSubmission(Student student, File file)
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
		return valid;
			
	}
	
	public ArrayList<Submission> invalidSubmissions()
	{
		return invalid;
	}
	
	        
    public ValidationError[] validateSubmission(Submission[] submissions) {
        ArrayList<ValidationError> errors = new ArrayList<ValidationError>();
        // Loop through all files and create an error if there's plagiarism
        ArrayList<Submission> files = submitted;
        int size = files.size();
        for (int i=0; i<(size-1);i++) {
        	for (int j =i+1; j<size;j++) {
        		if (files.get(i).content().equals(files.get(j).content())){
        			ValidationError error = new ValidationError(files[i]);
        			error.addError("Plagiarism", "Plagiarism detected.");
        			errors.add(error);
				invalid.add(files[i]);

        		} 
        	} 
		valid.add(files.get(i));
        	
        }

	    if(errors.size() > 0)
	    {
		System.out.println(errors[0]);
	    	return errors.toArray(new ValidationError[0]);
	    
	    } else {
	        
	    	return null;
	    }
	}

	@Override
	public ValidationError[] validateSubmission(Submission submission) {
		// TODO Auto-generated method stub
		return null;
	}
}
