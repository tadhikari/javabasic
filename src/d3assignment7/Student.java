package d3assignment7;

public class Student {
	
	private int studentid;
	private char studentType;
	private String name, resStatus;
	long feesPerMonth;
	
	public Student() {
		studentid = 10;
		studentType = 'F';
	}
	
	public Student(int id, char type, String name, String status, long fees) {
		
		studentid = id;
		studentType=type;
		this.name = name;
		this.feesPerMonth = 0;
		this.resStatus = status;
		if(resStatus.equals("Hostelite")) {
			this.feesPerMonth = fees;
		}
	
	}
	
	public int getStudentid() {
		return studentid;
	}
	
	public void setStudentid(int id) {
		this.studentid = id;
	}
	

	public char getStudentType() {
		return studentType;
	}
	
	public void setStudentType(char type) {
		this.studentType = type;
	}
	
	public long getFeesPerMonth() {
		return feesPerMonth;
	}
	
	public String getName() {
		return name;
	}
	
	public String getResStatus() {
		return resStatus;
	}
	
	
	public static void main(String[] args) {
		Student student = new Student(11,'A',"Rajesh Patel","Hostelite",500);
		System.out.println("ID: "+student.getStudentid());
		System.out.println("Type: "+student.getStudentType());
		System.out.println("Name: "+student.getName());
		System.out.println("Resedential Status: "+student.getResStatus());
		System.out.println("Fees: "+student.getFeesPerMonth());
	}

}