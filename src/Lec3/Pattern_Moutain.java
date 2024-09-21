package Lec3;

import java.util.*;

public class Pattern_Moutain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner Sc = new Scanner(System.in);
        int n  = Sc.nextInt();
        int row = 1;
        int star = 1;
        int space = 2 * n - 3;
        while(row <= n) {
        	int i = 1;
        	int val = 1;
        	while(i <= star) {
        		System.out.print(val+"");
        		i++;
        		val++;
        	}
        int j = 1;
        while(j <= space) {
        	System.out.print(" ");
        	j++;
        }
        int k = 1;
        val--;
        if (row == n) {
        	k = 2;
        	val--;
        }
        while(k <= star) {
        	System.out.print(val+"");
        	val--;
        	k++;
        }
        star++;
        space -= 2;
        row++;
        System.out.println();
        }
    }
}
