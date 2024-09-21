package Lec2;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		int space = n -1;
		int star = n;
		int row = 1;
		while (row <= n) {
			//space
			int i = 1;
			while(i <= star) {
				System.out.print("");
				i++;
			}
			// star
			int j = 1;
			while (j <= star) {
				   System.out.print("*  ");
				   j++;
			}
			// next row
			System.out.println();
			row++;
			star--;
			space--;
		   }
	 }
}


