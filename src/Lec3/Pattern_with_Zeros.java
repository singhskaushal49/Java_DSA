package Lec3;

import java.util.Scanner;

public class Pattern_with_Zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int star = 1;
        int row = 1;
        
        while (row <= n) {
        	
        	int i = 1;
        	
        	while (i <= star) {
        		if(i==1 || i==star)
        			System.out.print(row+"\t");
        		else {
        			System.out.print(0+"\t");
        		}
        		i++;
        	}
        	row++;
        	System.out.println();
        	star++;
        }
	}

}
