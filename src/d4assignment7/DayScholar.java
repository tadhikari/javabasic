package d4assignment7;

public final class DayScholar extends Student{
	
	String residentialAddress;
	
	public DayScholar() {
		
	}
	
	public DayScholar(int id, char type, String resA, double fees, String name) {
		residentialAddress = resA;
		super.studentId = id;
		super.feesPerMonth = fees;
		super.studentName = name;
		super.studentType = type;
	}
	
	public void displayDaySDetail() {
		System.out.println(residentialAddress);
		System.out.println(super.studentId);
		super.calculateFees();
		System.out.println(super.feesPerMonth);
		System.out.println(super.studentName);
		System.out.println(super.studentType);
	}
	
	public static void main(String[] args) {
		
		DayScholar ds = new DayScholar(5,'A',"Vishalnagar",500,"Raju");
		ds.displayDaySDetail();
	}
	

}
