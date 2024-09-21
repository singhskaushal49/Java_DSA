package Lec4;

import java.util.Scanner;

public class Chewbacca_and_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner Sc = new Scanner(System.in);
        long n = Sc.nextLong();
        long mul = 1;
        long sum = 0;
        while (n > 0) {
        	long rem = n % 10;
        	if (rem >= 5 && n != 9) {
        		sum = sum + (9 - rem) * mul;
        	} else {
        		sum = sum + rem + mul;
        	}
        	n = n / 10;
        	mul = mul * 10;
        }
        System.out.println(sum);
	}
}
