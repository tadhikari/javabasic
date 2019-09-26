package d3assignment8;

public class Student {

	private int studentId;
	private char studentType;
	private String studentName;
	private String residentialStatus;
	private double feesPerMonth;
	
	public Student() {
		
	}
	
	public Student(int id, char type, String firstName, String lastName) {
		this.studentId = id;
		this.studentType = type;
		this.studentName = firstName + " "+lastName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public char getStudentType() {
		return studentType;
	}

	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getResidentialStatus() {
		return residentialStatus;
	}

	public void setResidentialStatus(String residentialStatus) {
		this.residentialStatus = residentialStatus;
	}

	public void calulateFees(double semesterFees) {
		feesPerMonth = semesterFees/6.0;
	}
	
	public void calulateFees(double semesterFees, double hostelFees) {
		feesPerMonth = semesterFees / 6.0;
		feesPerMonth = feesPerMonth + hostelFees;
	}
	
	public double getFeesPerMonth() {
		return feesPerMonth;
	}
	
	public static void main(String args[]) {
		Student student = new Student(5,'A',"Rajesh","Patel");
		student.setResidentialStatus("Day Scholar");
		
		if(student.getResidentialStatus().equals("Hostelite")) {
			student.calulateFees(500, 500);
		}
		else {
			student.calulateFees(500);
		}
		
		System.out.println("ID: "+student.getStudentId());
		System.out.println("Name: "+student.getStudentName());
		System.out.println("Residential Status: "+student.getResidentialStatus());
		System.out.println("Fees Per Month: "+student.getFeesPerMonth());

			
	}

}
