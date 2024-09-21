package Lec18;

import java.util.Scanner;

public class Check_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 89;
		 System.out.println(IsPrime(n));
    
	}

	private static boolean IsPrime(int n) {
		// TODO Auto-generated method stub
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
