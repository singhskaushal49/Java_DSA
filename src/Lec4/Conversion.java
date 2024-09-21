package Lec4;

import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner Sc = new Scanner(System.in);
        int minf = Sc.nextInt();
        int maxf = Sc.nextInt();
        int step = Sc.nextInt();
        
        for (int i = minf; i <= maxf; i = i + step) {
        	
        	int c = (int) ((5.0 / 9) * (i - 32));
        	System.out.println(i + " \t " + c);
        }
	}

}
