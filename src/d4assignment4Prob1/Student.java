package d4assignment4Prob1;

public class Student {

	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected int semesterFees; // error
	protected int feesPerMonth;
	
	public Student(int studentId) {
		this.studentId = studentId;
	}
	
	public Student(int id, char type, String name, int semFees) {
		super();
		this.studentId = id;
		this.studentType = type;
		this.studentName = name;
		this.semesterFees =semFees;
	}

	
	void displayDetails() {
		
	}
	
}


