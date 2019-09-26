package d4assignment4Prob1;

public class DayScholar extends Student {

	private String residentialAddress;
	
	DayScholar(int studentId,char studentType, String studName, int semFees, String residentialAddress){
		super(studentId, studentType, studName, semFees);
		this.residentialAddress = residentialAddress;
		
	}
	
	void displayDetails() {
		System.out.println(studentId);
		System.out.println(studentType);
		System.out.println(studentName);
		System.out.println(semesterFees);
		System.out.println(residentialAddress);
	}
	
	
}