package d2assignment4;

public class CourseManagement {

	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.setStudentid(100);
		student.setStudentType('L');
		
		System.out.println(student.getStudentid());
		System.out.println(student.getStudentType());
	}

}
