package d4assignment3;

public class Student {

	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected double feesPerMonth;
	
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

	public double getFeesPerMonth() {
		return feesPerMonth;
	}
	
	public void setFeesPerMonth(double d) {
		this.feesPerMonth = d;
	}
	
	public void displayStudentDetails() {
		System.out.println(getStudentId());
		System.out.println(getStudentType());
		System.out.println(getStudentName());
		System.out.println(getFeesPerMonth());
	}


}
