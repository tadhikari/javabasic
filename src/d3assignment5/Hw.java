package d3assignment5;

import java.util.Scanner;

public class Hw {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
		String word = scan.nextLine();
		System.out.println("Length: "+word.length());
		System.out.println("Hi "+ word);
		System.out.println("Lowercase: "+word.toLowerCase());
		System.out.println("Uppercase: "+word.toUpperCase());
		System.out.println("Starts with a: "+word.startsWith("a"));
		word = word.replace(word, "Krishna");
		System.out.println("After replacement: "+word);
	}
	
	
	
}
