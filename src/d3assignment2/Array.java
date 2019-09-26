package d3assignment2;

public class Array {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstArrayMatrix[][] = {{1,1,1},{1,1,1}};
		int secondArraymatrix[][] = {{2,2,2},{2,2,2}};
		
		printArray(1,firstArrayMatrix);
		System.out.println();
		printArray(2,secondArraymatrix);
		System.out.println();
		sumArray(firstArrayMatrix, secondArraymatrix);
		
	}
	
	public static void printArray(int num,int x[][]) {
		
		System.out.println("Matrix "+num);
		
		for(int i=0;i < x.length;i++) {
			for(int j= 0;j<x[i].length;j++) {
				System.out.print(x[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public static void sumArray(int x[][], int y[][]) {
		
		System.out.println("Sum of the Matrices");
		
		for(int i=0;i < x.length;i++) {
			for(int j= 0;j<x[i].length;j++) {
				System.out.print(x[i][j]+y[i][j]);
			}
			System.out.println();
		}
		
	}
	

}
