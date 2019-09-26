package d4assignment5;

public class DayScholar extends PostGradStudent{
	
	private String residentialAddress;
	private double fees;
	
	public DayScholar(int pCourseId, String pCourseName, double pCourseFees,int sid, char sType, String sName, String rAddress) {
		super(pCourseId,pCourseName,pCourseFees,sid,sType,sName);
		this.residentialAddress = rAddress;
	}
	
	public void calculateFees() {
		fees = postCoursefees / 6;
	}
	
	public double getFees() {
		return fees;
	}
	
	
	
	public static void main(String[] args) {
		
		DayScholar dS = new DayScholar(5,"OOP",16000,1001,'D',"Manu","NO 32/3 Vijayanagar");
		
			System.out.println("Name: "+dS.studentName);
			System.out.println("Address: "+dS.residentialAddress);
			System.out.println("ID: "+dS.studentId);
			dS.calculateFees();
			System.out.println("Fees per month: "+dS.fees);
			System.out.println("Fees per Semester: "+dS.postCoursefees);
			System.out.println("Type: "+dS.studentType);
			System.out.println("Course Id: "+dS.postCourseId);
			System.out.println("Course Name: "+dS.postCourseName);
		
	}
	
}
