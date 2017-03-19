package lms;

public class lmsdriver {

	public static void main(String[] args) {
		Subject testSubject = new Subject("Calculus", "MATH10001");
		String[] roles = {"lecturer"};
		
		Staff testStaff = new Staff("Jane Smith", 12/11/2020, "ddd", "33", roles);
		testStaff.subjects[0] = testSubject;
		testStaff.subjects[0].createAssignment("Project1", "A question sheet", 13/5/2003, 3);
		
		Student testStudent1 = new Student("John Smith", 12/11/2020, "ddd", "33", "fefsf");
		Student testStudent2 = new Student("John Smith", 12/11/2020, "ddd", "33", "fefsf");
		Student testStudent3 = new Student("John Smith", 12/11/2020, "ddd", "33", "fefsf");
		Student testStudent4 = new Student("John Smith", 12/11/2020, "ddd", "33", "fefsf");
		Student testStudent5 = new Student("John Smith", 12/11/2020, "ddd", "33", "fefsf");
		
		testStudent1.subjects[0] = testSubject;
		testStudent2.subjects[0] = testSubject;
		testStudent3.subjects[0] = testSubject;
		testStudent4.subjects[0] = testSubject;
		testStudent5.subjects[0] = testSubject;
		
		//files
		File sameFile1 = new File();
		File sameFile2 = new File();
		File differentFile1 = new File("different","different content");
		File differentFile2 = new File("different2","more different content");
		File differentFile3 = new File("different3","even more different content");
		
		
		testStudent1.subjects[0].assignments.get(0).createSubmission(testStudent1, sameFile1);
		testStudent2.subjects[0].assignments.get(0).createSubmission(testStudent2, differentFile1);
		testStudent3.subjects[0].assignments.get(0).createSubmission(testStudent3, sameFile2);
		testStudent4.subjects[0].assignments.get(0).createSubmission(testStudent4, differentFile2);
		testStudent5.subjects[0].assignments.get(0).createSubmission(testStudent5, differentFile3);
		
		testStaff.subjects[0].assignments.get(0).validSubmissions();
		testStaff.subjects[0].assignments.get(0).invalidSubmissions();
		
		System.out.println("The following students submitted valid assignments: ");
		for (Submission sub : testStaff.subjects[0].assignments.get(0).valid) {
			System.out.println(sub.submitter.studentID);
		}
		
		System.out.println("The following students submitted invalid assignments: ");
		for (Submission sub : testStaff.subjects[0].assignments.get(0).invalid) {
			System.out.println(sub.submitter.studentID);
		}
		
		

	}

}
