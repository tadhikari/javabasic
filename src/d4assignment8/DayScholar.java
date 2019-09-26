package d4assignment8;

public class DayScholar extends Student{

	public String residentialAddress;
	
	public DayScholar() {
		
		
	}
	
	public DayScholar(int id, char type, String name,double feesPerMonth, String residentialAddress) {
		setStudentId(id);
		setFeesPerMonth(feesPerMonth);
		setStudentType(type);
		super.studentName = name;
		this.residentialAddress = residentialAddress;
		
		
	}
	
	void calculateFees(double semesterFees) {
		feesPerMonth = semesterFees / 6.0;
	}
	
	
	public String getResidentialAddress() {
		return residentialAddress;
	}
	
	public void displayStudentDetails() {
		System.out.println(getStudentId());
		System.out.println(getStudentType());
		System.out.println(getStudentName());
		System.out.println(getFeesPerMonth());
		System.out.println(getResidentialAddress());
	}
	
	public static void main(String[] args) {
		
		Student s = new DayScholar(4,'A',"Harihar",500,"Shridi");
		s.displayStudentDetails();
		
		
	}

	
}
