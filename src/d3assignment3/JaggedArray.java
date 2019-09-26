package d3assignment3;

public class JaggedArray {
	
	public static void main(String args[]) {
		String[][] info = {{"Tony","Java","C","C++"},{"Thomas","JAVA","UNIX"},
							{"Dinil","Linux","Oracle"},{"Delvin","RDBMS","C#","ORACLE"}};
	
		for(int i=0;i<info.length;i++) {
			for(int j=0;j<info[i].length;j++) {
				System.out.print(info[i][j]+"\t");
			}
			System.out.println();
		}
	
	
	}
	
}
