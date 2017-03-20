package lms;

public class lmsdriver {

	public static void main(String[] args) {
		//create subject
		Subject testSubject = new Subject("Calculus", "MATH10001");
		String[] roles = {"lecturer"};
		
		//create staff
		Staff testStaff = new Staff("Jane Smith", 12/11/2020, "ddd", "33", roles);
		
		//create assignment for subject
		testSubject.createAssignment("Project1", "A question sheet", 13/5/2003, 3);
		
		Student testStudent1 = new Student("John Smith", 12/11/2020, "ddd", "1", "fefsf");
		Student testStudent2 = new Student("John Smith", 12/11/2020, "ddd", "2", "fefsf");
		Student testStudent3 = new Student("John Smith", 12/11/2020, "ddd", "3", "fefsf");
		Student testStudent4 = new Student("John Smith", 12/11/2020, "ddd", "4", "fefsf");
		Student testStudent5 = new Student("John Smith", 12/11/2020, "ddd", "5", "fefsf");
		
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
		
		File[] files1 = {sameFile1, sameFile2};
		File[] files2 = {sameFile1, differentFile1};
		File[] files3 = {sameFile1, sameFile2};
		
		
		
		//Students making submissions
		testStudent1.subjects.get(0).assignments.get(0).createSubmission(testStudent1, files1);
		testStudent2.subjects.get(0).assignments.get(0).createSubmission(testStudent2, files2);
		testStudent3.subjects.get(0).assignments.get(0).createSubmission(testStudent3, files3);
		testStudent4.subjects.get(0).assignments.get(0).createSubmission(testStudent4, files1);
		testStudent5.subjects.get(0).assignments.get(0).createSubmission(testStudent5, files2);
		
		//Staff calls validator
		testSubject.assignments.get(0).validSubmissions();
		testSubject.assignments.get(0).invalidSubmissions();
		
		//Prints out results
		System.out.println("The following students submitted valid assignments: ");
		for (Submission sub : testSubject.assignments.get(0).valid) {
			System.out.println(sub.submitter.studentID);
		}
		
		System.out.println("The following students submitted invalid assignments: ");
		for (Submission sub : testSubject.assignments.get(0).invalid) {
			System.out.println(sub.submitter.studentID);
		}
		
		

	}

}
