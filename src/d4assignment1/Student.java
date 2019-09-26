package d4assignment1;

public class Student {

	private int studentId;
	private char studentType;
	private String studentName;
	private double feesPerMonth;
	
	public Student() {
		
	}
	
	public Student(int id, char type, String firstName, String lastName) {
		this.studentId = id;
		this.studentType = type;
		setStudentName(firstName, lastName);
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

	public void setStudentName(String firstName, String lastName) {
		this.studentName = firstName + " "+lastName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
	public double getFeesPerMonth() {
		return feesPerMonth;
	}
	
	public void setFeesPerMonth(double d) {
		this.feesPerMonth = d;
	}
	

}
