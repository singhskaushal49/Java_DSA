package Lec2;

import java.util.*;

public class Pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner Sc = new Scanner(System.in);
       int n = Sc.nextInt();
       int row = 1;
       int star = n;
       int space = -1;
       
       while(row <= n) {
    	   // star
    	   int i = 1;
    	   while(i <= star) {
    		   System.out.print("* ");
    		   i++;
    	   }
    	   int j = 1;
    	   while (j <= space) {
    		   System.out.print("  ");
    		   j++;
    	   }
    	   int k = 1;
    	   if (row == 1) {
    		   k = 2;
    	   }
    	   while (k <= star) {
    		   System.out.print("* ");
    		   k++;
    	   }
    	   row++;
    	   star--;
    	   space = space + 2;
    	   System.out.println();
       }
	}
}
