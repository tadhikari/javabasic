package d2assignment9;

public class Student {
	
	private int studentId = 550;
	private String lastName;
	private String firstName;
	private char sType;
	
	static int numberOfObjects = 0;
	
	
	public Student() {
		
		if(numberOfObjects > 0) {
			studentId = 550 + numberOfObjects;
		}
		
		numberOfObjects++;
	}
	
	
	public Student(char sType, String firstName, String lastName) {
		this();
		this.sType = sType;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void displayDetail() {
		System.out.println("ID: "+studentId);
		System.out.println("Student Type: "+ sType);
		System.out.println("First Name: "+ firstName);
		System.out.println("Last Name: "+lastName);
	}
	
	public static void main(String[] args) {
	
		Student s1 =  new Student('D',"Bony","Thomas");
		Student s2 =  new Student('H',"Dinil","Bose");
		
		s2.displayDetail();
	
	}
	
		
}
