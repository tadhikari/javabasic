package d3assignment4;

public class Student {
	
	private int studentid;
	private char studentType;
	String firstName, lastName;
	public Student() {
		studentid = 10;
		studentType = 'F';
	}
	
	public Student(int id, char type, String firstname, String lastName) {
		studentid = id;
		studentType=type;
		this.firstName = firstname;
		this.lastName = lastName;
	}
	
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int id) {
		this.studentid = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public char getStudentType() {
		return studentType;
	}
	public void setStudentType(char type) {
		this.studentType = type;
	}
	
	public static void main(String[] args) {
		Student student = new Student();
		System.out.println("***Default***");
		System.out.println(student.getStudentid());
		System.out.println(student.getStudentType());
		
		student = new Student(11,'A',"Rajesh","Patel");
		System.out.println("**Overloaded***");
		System.out.println(student.getStudentid());
		System.out.println(student.getStudentType());
		System.out.println(student.getFirstName());
		System.out.println(student.getLastName());
		
	}

}