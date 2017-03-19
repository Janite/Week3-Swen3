 package lms;

import java.util.ArrayList;

/** Simple Sample Validator that only considers the file types
 * Created by mat on 10/02/2016.
 */
public class Validator implements SubmissionValidator{

    @Override
    public ValidationError[] validateSubmission(Submission submission) {
        ArrayList<ValidationError> errors = new ArrayList<ValidationError>();
        // Loop through all files and create an error if there's plagiarism
        ArrayList<Submission> files = submission.includedFiles();
        int size = files.size();
        for (int i=0; i<(size-1);i++) {
        	for (int j =i+1; j<size;j++) {
        		if (files[i].content().equals(files[j].content())){
        			ValidationError error = new ValidationError(files[i]);
        			error.addError("Plagiarism", "Plagiarism detected.");
        			errors.add(error);
        		}
        	}
        	
        }
        
        if(errors.size() > 0){
           return errors.toArray(new ValidationError[0]);
        } else {
            return null;
        }
    }
}