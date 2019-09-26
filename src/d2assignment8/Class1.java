package d2assignment8;

public class Class1 {
	
	static int i;
	static int j;
	static boolean k;
	static boolean l;
	
	public Class1() {
		i = 22;
		j = 14000;
	
	}
	
	
	public static void main(String args[]) {
		
		
		Class1 class1 = new Class1();
		k = class1.method1(i);
		l = class1.method1(j);
		
		if(k==true && l==true) {
			System.out.println(" Is a new employee ");
		}
		else {
			System.out.println(" Is not a new employee ");
		}
		
	}
	
	public boolean method1(int i) {
		
		if(i>20 && i<30) {
			return true;
		}
		else {
			return false;
		}
		
	
	}
	
	public boolean method2(int j) {
		
		if(j>=14000 && j<20000) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
