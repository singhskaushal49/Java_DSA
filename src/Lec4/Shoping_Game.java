package Lec4;

import java.util.Scanner;

public class Shoping_Game {

	public static void main(String[] args) {

		Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        
        while (t > 0) {
        	int m = Sc.nextInt();
        	int n = Sc.nextInt();
        	
        	int a = 0;
        	int h = 0;
        	int count = 1;
        	while (true) {
        		a = a + count;
        		if (a > m) {
        			    System.out.println("Harshit");
        			    break;
        		}
        		count++;
        		h = h + count;
        		if (h > n) {
        			System.out.println("Aayush");
        			break;
        		}
        		count++;
        	}
        	t--;
        } 
	}
}
