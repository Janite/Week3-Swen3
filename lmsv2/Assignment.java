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
	
	//Check for plagiarism between submissions
    public ValidationError[] validateSubmissions() {
        ArrayList<ValidationError> errors = new ArrayList<ValidationError>();
        // Loop through all files and create an error if there's plagiarism
        ArrayList<Submission> submissions = submitted;
        int size = submissions.size();
        for (int i=0; i<(size-1);i++) {
        	//get files from submission 1
        	ArrayList<File> files1 = submissions.get(i).includedFiles();
        	for (int j =i+1; j<(size-1);j++) {
        		
        		//get files from submission 2
        		ArrayList<File> files2 = submissions.get(i).includedFiles();
        		
        		//check files for plagarism
        		if(submissions.get(i).submitter==submissions.get(j).submitter){
        			//same student, everything is fine. Move on to next submission
        		}else{
        			//check for plagiarism
        			for(int k=0; k<(files1.size()-1); k++){
        				for(int m=0; m<(files2.size()-1); m++){
        					
        					if (files1.get(i).content().equals(files2.get(j).content())){
        						
        						submissions.get(i).valid = false;
        						submissions.get(j).valid = false;
        						
            					ValidationError error1 = new ValidationError(files1.get(i));
            					ValidationError error2 = new ValidationError(files1.get(i));
            					error1.addError("Plagiarism", "Plagiarism detected.");
            					error2.addError("Plagiarism", "Plagiarism detected.");
            					errors.add(error1);
            					errors.add(error2);
            			
            					//Add both files to invalid submissions
            					invalid.add(submissions.get(i));
            					invalid.add(submissions.get(j));
            				}
        					
        				}
        			} 
        		}
        		
        		//If the file is still valid
        		if(j==size-1 && submissions.get(i).valid){
        			//Add this file to valid submissions
        			valid.add(submissions.get(i));
        		}
        		
        	} 
        	
        }

	    if(errors.size() > 0)
	    {
		System.out.println(errors.get(0));
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
