package Lec5;

import java.util.*;

public class Dec_to_Bin {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int n = Sc.nextInt();
        int sum = 0;
        int mul = 1;
        
        while (n > 0) {
        	int rem = n % 2;
        	sum = sum + rem * mul;
        	mul = mul * 10;
        	n = n / 2;
        }
        System.out.println(sum);
	}
}
