package d1assignment6;

public class Operator {
	
	public static void main(String[] args) {
		
		int intVal=10;
		float floatVal = 3.0f;
		boolean bool1 = true;
		boolean bool2 = false;
		boolean bool3 = true;
		
		
		//Arithematics: Modulus Operator
		
		System.out.println("Aithematic");
		System.out.println(intVal + " % " + floatVal + "=" + 
													(intVal % floatVal));
		System.out.println();
		
		// String Concatenation : observe the difference
		System.out.println("String Concatination");
		System.out.println("Day " + 2 + " Session");
		System.out.println("\n" + 2 + 3 + "\n" + (2+3));
		System.out.println();
		
		// Relational: Equality Operator
		System.out.println("Relational");
		System.out.println(intVal + " == " + floatVal + " = " + (intVal==floatVal));
		System.out.println();
		
		bool2 = false;
		
		if(bool1 || (bool1 && (bool2 = false))) {
			System.out.println("Sucesss");
		}
		else {
			System.out.println("Failure");
		}
		
		
		System.out.println("bool2 value : " + bool2);
		
	}
	
}
