package Lec3;

import java.util.Scanner;

public class Pattern26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		   int n = Sc.nextInt();
		   int row = 1;
		   int space = n - 1;
		   int star = 1;
		   int val = 1;
		   
		   while(row <= n) {
			   // space
			   int i = 1;
			   while (i <= space) {
				   System.out.print("\t ");
				   i++;
			   }
			   // star
			   int j = 1;
			   val = 1;
			   while (j <= star) {
				   System.out.print(val+"\t ");
				   val++;
				   j++;
			   }
			   row++;
			   space--;
			   star = star + 2;
			   System.out.println();
	}

}
	}
