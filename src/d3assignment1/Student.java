package d3assignment1;

public class Student {
	
	private int studentId = 550;
	private String lastName;
	private String firstName;
	private char sType;
	
	static int numberOfObjects = 10;
	
	
	public Student() {
		
		numberOfObjects++;
	}
	
	
	public Student(char sType, String firstName, String lastName) {
		this();
		this.sType = sType;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	

	public static int getStudentCount() {
		return numberOfObjects;
	}
	
	
	public static void main(String[] args) {
	
		Student s1 =  new Student('D',"Bony","Thomas");
		Student s2 =  new Student('H',"Dinil","Bose");
		
		System.out.println(s2.getStudentCount());
	
	}
	
		
}
