package d4assignment5;

public class PostGradStudent extends Student{
	
	protected int postCourseId;
	protected String postCourseName;
	protected double postCoursefees;
	
	public PostGradStudent(int pCourseId,String pCourseName, double pCourseFees, int sid, char sType, String sName) {
		super(sid,sType,sName);
		postCourseId = pCourseId;
		postCourseName = pCourseName;
		postCoursefees = pCourseFees;
	}
	
	public int getCourseId() {
		return postCourseId;
	}
	
	public String getCourseName() {
		return postCourseName;
	}
	
	public double getFees() {
		return postCoursefees;
	}
	
}
