package Lec2;

import java.util.*;

public class Pattern11 {
   
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
			   while (j <= star) {
				   if (j % 1 == 0) {
					   System.out.print("* ");
				   }else {
					   System.out.print("  ");
				   }
				   j++;
			   }
			   row++;
			   space--;
			   star += 2;
			   System.out.println();
		    }
	}

}
