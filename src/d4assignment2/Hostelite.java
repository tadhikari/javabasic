package d4assignment2;

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
	
	public static void main(String[] args) {
		
		Hostelite student = new Hostelite(1,'A',"Jackie Shroff",500,"MDH",3);
		
		System.out.println(student.getStudentId());
		System.out.println(student.getStudentType());
		System.out.println(student.getStudentName());
		System.out.println(student.getFeesPerMonth());
		System.out.println(student.getHostelName());
		System.out.println(student.getRoomNumber());
		
		
	}

	
}
