package d2assignment7;

public class passByVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sId = 25;
		passByVal val = new passByVal();
		System.out.println(sId);
		val.passTheValueMethod(sId);
		System.out.println("The sId are " + sId);
		
		
		System.out.println("\n*****pass by reference *****\n");
		Student s = new Student();
		s.setId(100);
		System.out.println("Before passing to passTheValueMethod " + s.getId() );
		val.passTheValueMethod(s);
		System.out.println("After passing to passTheValueMethod " + s.getId() );
		
		
	}
	
	public void passTheValueMethod(int sId) {
	
		sId = 10;
		System.out.println("The sId are " + sId);
		
	}
	
	public void passTheValueMethod(Student student) {
		
		student.setId(200);
		System.out.println("value inside the method: "+ student.getId());
		
	}

}

class Student {
	
	private int sId;
	
	public void setId(int id) {
		sId = id;
	}
	
	public int getId() {
		return sId;
	}
	
	
}




