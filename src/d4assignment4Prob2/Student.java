package d4assignment4Prob2;

public class Student extends CourseRegistration{

	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected int semesterFees; 
	protected int feesPerMonth;
	
	public Student(int studentId, String cName) {
		super(cName);
		this.studentId = studentId;
	}
	
	public Student(int studentid, char studentType, String studName, int semFees, String cName) {
		
		this(studentid,cName);
		this.studentType = studentType;
		this.studentName = studName;
		this.semesterFees =semFees;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


