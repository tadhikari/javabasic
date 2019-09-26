package d4assignment5;

public class Student {

	protected static int studentId;
	protected char studentType;
	protected String studentName;
	
	public Student() {
		studentId++;
	}
	
	public Student(int id, char type, String studentName) {
		this();
		this.studentId = id;
		this.studentType = type;
		this.studentName = studentName;
	}

	
	

}
