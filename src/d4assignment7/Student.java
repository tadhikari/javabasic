package d4assignment7;

public class Student {

	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected double feesPerMonth;
	protected final double semesterFees = 1200;
	
	public Student() {
		
	}
	
//	public Student(int id, char type, String firstName, String lastName) {
//		this.studentId = id;
//		this.studentType = type;
//		this.studentName = firstName + " "+lastName;
//	}

//	public int getStudentId() {
//		return studentId;
//	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

//	public char getStudentType() {
//		return studentType;
//	}

	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}

//	public String getStudentName() {
//		return studentName;
//	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void calculateFees() {
		feesPerMonth = semesterFees / 6.0;
	}
	
	public void displayDetail() {
		
	}

}
