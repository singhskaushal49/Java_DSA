package Lec3;

import java.util.Scanner;

public class Pattern27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		   int n = Sc.nextInt();
		   int row = 1;
		   int space = n - 1;
		   int star = 1;
		    
		   
		   while(row <= n) {
			   // space
			   int i = 1;
			   while (i <= space) {
				   System.out.print("  ");
				   i++;
			   }
			   // star
			   int j = 1;
			   int val = 1;
			   while (j <= star) {
				   System.out.print(val + " ");
				   if (j <= star / 2) {
					   val++;
				   }else {
					   val--;
				   }
				   j++;
			   }
			   row++;
			   space--;
			   star = star + 2;
			   System.out.println();
	          }

        }
}