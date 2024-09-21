package Lec5;

import java.util.*;

public class Bin_to_Dec {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		 int n = Sc.nextInt();
	        int sum = 0;
	        int mul = 1;
	        
	        while (n > 0) {
	        	int rem = n % 10;
	        	sum = sum + rem * mul;
	        	mul = mul * 2;
	        	n = n / 10;
	        }
	        System.out.println(sum);
	}

}
