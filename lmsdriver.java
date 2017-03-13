package lms;

public class lmsdriver {

	public static void main(String[] args) {
		public Subject testSubject = new Subject("Calculus", "MATH10001");
		public Assignment testAssignment = testSubject.createAssignment();
		
		public Staff testStaff = new Staff("Jane Smith", 12/11/2020, "ddd", 33, "fefsf");
		testStaff.subjects[0] = "Calculus";
		testStaff.subjects[0].createAssignment();
		
		public Student testStudent1 = new Student("John Smith", 12/11/2020, "ddd", 33, "fefsf");
		public Student testStudent2 = new Student("John Smith", 12/11/2020, "ddd", 33, "fefsf");
		public Student testStudent3 = new Student("John Smith", 12/11/2020, "ddd", 33, "fefsf");
		public Student testStudent4 = new Student("John Smith", 12/11/2020, "ddd", 33, "fefsf");
		public Student testStudent5 = new Student("John Smith", 12/11/2020, "ddd", 33, "fefsf");
		
		testStudent1.subjects[0] = "Calculus";
		testStudent2.subjects[0] = "Calculus";
		testStudent3.subjects[0] = "Calculus";
		testStudent4.subjects[0] = "Calculus";
		testStudent5.subjects[0] = "Calculus";
		
		//files
		File sameFile1 = new File("same1");
		File sameFile2 = new File();
		File differentFile1 = new File();
		
		
		testStudent1.subjects[0].assignments[0].createSubmission();
		testStudent2.subjects[0].assignments[0].createSubmission();
		testStudent3.subjects[0].assignments[0].createSubmission();
		testStudent4.subjects[0].assignments[0].createSubmission();
		testStudent5.subjects[0].assignments[0].createSubmission();
		
		testStaff.subjects[0].validSubmissions();
		testStaff.subjects[0].invalidSubmissions();
		
		System.out.println("The following students submitted valid assignments: ");
		for (Submission sub in testStaff.subjects[0].valid) {
			System.out.println(sub.getStudentID());
		}
		
		System.out.println("The following students submitted invalid assignments: ");
		for (Submission sub in testStaff.subjects[0].invalid) {
			System.out.println(sub.getStudentID());
		}
		
		

	}

}
