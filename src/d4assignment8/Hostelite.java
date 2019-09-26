package d4assignment8;

public class Hostelite extends Student{

	private String hostelName;
	private int roomNumber;
	
	public Hostelite() {
		
		
	}
	
	public Hostelite(int id, char type, String name,double feesPerMonth, String hostelName, int roomNo) {
		setStudentId(id);
		setFeesPerMonth(feesPerMonth);
		setStudentType(type);
		super.studentName = name;
		this.hostelName = hostelName;
		this.roomNumber = roomNo;
	}
	
	public String getHostelName() {
		return hostelName;
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}
	void calculateFees(double semesterFees) {
		feesPerMonth = semesterFees / 6.0;
		feesPerMonth = feesPerMonth + 1200;
	}
	public void displayStudentDetails() {
		System.out.println(getStudentId());
		System.out.println(getStudentType());
		System.out.println(getStudentName());
		System.out.println(getFeesPerMonth());
		System.out.println(getHostelName());
		System.out.println(getRoomNumber());
	}

	
}
