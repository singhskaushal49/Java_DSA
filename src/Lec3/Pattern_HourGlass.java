package Lec3;

import java.util.Scanner;

public class Pattern_HourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int row = 1;
        int star = 2 * n + 1;
        int space = 0;
        int val = n;
        while (row <= 2 * n + 1) {
        	int i = 1;
        	while (i <= space) {
        		System.out.print("\t");
        		i++;
        	}
        	int j = 1;
        	int p = val;
        	while (j <= star) {
        		   System.out.print(p+"\t");
        		   if (j <= star/ 2) {
        			     p--;
        		   }else {
        			     p++;
        		   }
        		   j++;
        	}
        	if (row <= n) {
        		star -= 2;
        		space++;
        		val--;
        	} else {
        		star -= 2;
        		space--;
        		val++;
        	}
        	row++;
        	System.out.println("");
        }
	}

}
