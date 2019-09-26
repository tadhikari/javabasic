package d4assignment4Prob2;

public class CourseRegistration{
	
	static protected int regId;
	protected String courseName;
	CourseRegistration(){
		regId++;
	}
	
	CourseRegistration(String cName){
		this();
		courseName = cName;
	}
	
	public void displayDetails() {
		System.out.println("Registeration ID :"+regId);
		System.out.println("CourseName :"+courseName);
	}
	

}