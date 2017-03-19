package lms;

import java.util.ArrayList;

// Sample private submission class to be replaced by your implementation
class Submission {
	
	public int attemptNum;
	public int numFiles;
	private ArrayList<File> files;
    // Return two fake files
    public ArrayList<File> includedFiles(){
        return files;
    }
    public Student submitter;
    
    public Submission (Student student, File file) {
    	this.submitter = student;
    	this.files = new ArrayList<File>();
    	this.files.add(file);
    	
    }
}
