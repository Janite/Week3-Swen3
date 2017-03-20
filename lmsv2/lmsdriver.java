package lms;

public class lmsdriver {

	public static void main(String[] args) {
		Subject testSubject = new Subject("Calculus", "MATH10001");
		String[] roles = {"lecturer"};
		
		Staff testStaff = new Staff("Jane Smith", 12/11/2020, "ddd", "33", roles);
		
		testStaff.subjects.add(testSubject);//<--- I'm getting a null pointer exception for this line. Help?
		testStaff.subjects.get(0).createAssignment("Project1", "A question sheet", 13/5/2003, 3);
		
		Student testStudent1 = new Student("John Smith", 10/11/2020, "ddd", "30", "fefsf");
		Student testStudent2 = new Student("Jono Smith", 11/11/2020, "ddd", "31", "fwfsf");
		Student testStudent3 = new Student("John Smoth", 12/11/2020, "ddd", "32", "feef");
		Student testStudent4 = new Student("John Smath", 12/12/2020, "ddd", "33", "fersf");
		Student testStudent5 = new Student("John Smuth", 12/10/2020, "ddd", "34", "feysf");
		
		testStudent1.subjects.add(testSubject);
		testStudent2.subjects.add(testSubject);
		testStudent3.subjects.add(testSubject);
		testStudent4.subjects.add(testSubject);
		testStudent5.subjects.add(testSubject);
		
		//files
		File sameFile1 = new File();
		File sameFile2 = new File();
		File differentFile1 = new File("different","different content");
		File differentFile2 = new File("different2","more different content");
		File differentFile3 = new File("different3","even more different content");
		
		
		testStudent1.subjects.get(0).assignments.get(0).createSubmission(testStudent1, sameFile1);
		testStudent2.subjects.get(0).assignments.get(0).createSubmission(testStudent2, differentFile1);
		testStudent3.subjects.get(0).assignments.get(0).createSubmission(testStudent3, sameFile2);
		testStudent4.subjects.get(0).assignments.get(0).createSubmission(testStudent4, differentFile2);
		testStudent5.subjects.get(0).assignments.get(0).createSubmission(testStudent5, differentFile3);
		
		testStaff.subjects.get(0).assignments.get(0).validateSubmissions();
		
		
		System.out.println("The following students submitted valid assignments: ");
		for (Submission sub : testStaff.subjects.get(0).assignments.get(0).valid) {
			System.out.println(sub.submitter.studentID);
		}
		
		System.out.println("The following students submitted invalid assignments: ");
		for (Submission sub : testStaff.subjects.get(0).assignments.get(0).invalid) {
			System.out.println(sub.submitter.studentID);
		}
		
		

	}

}
