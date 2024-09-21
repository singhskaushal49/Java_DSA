package Lec6;

import java.util.Scanner;

public class Odd_and_Even_back_in_Delhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner Sc = new Scanner(System.in);
        int carno = Sc.nextInt();
        if (Even_back_in_Delhi(carno)==true) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
	}
	public static boolean Even_back_in_Delhi(int n) {
		int sumeven = 0;
		int sumodd = 0;
		while(n > 0) {
			int rem = n % 10;
			if (rem % 2 == 0) {
				sumeven+=rem;
			}
			else {
				sumodd+=rem;
			}
			n = n/10;
		}
		if(sumeven%4==0 || sumodd%3==0) {
			return true;
		}
		else {
			return false;
		}
	}
}
