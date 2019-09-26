package d4assignment4Prob2;

public class DayScholar extends Student {

	private String residentialAddress;
	
	DayScholar(int studentId,char studentType, String studName, int semFees, String residentialAddress, String cName){
		super(studentId, studentType, studName, semFees, cName);
		this.residentialAddress = residentialAddress;
		
	}
	
	public void displayDetails() {
		System.out.println(studentId);
		System.out.println(studentType);
		System.out.println(studentName);
		System.out.println(semesterFees);
		System.out.println(residentialAddress);
		System.out.println(super.courseName);
	}
	
	
}