package Lec14;

import java.util.*;

public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Integer> kaushal = new ArrayList<>();
        System.out.println(kaushal);
        // add
        kaushal.add(10);
        kaushal.add(20);
        kaushal.add(30);
        kaushal.add(40);
        System.out.println(kaushal);
        kaushal.add(1, -9);// index ka range 0 to size
        System.out.println(kaushal);
        // size
        System.out.println(kaushal.size());
        // get index ka range 0 to size - 1
        System.out.println(kaushal.remove(2));// index number
        System.out.println(kaushal);
        // update
        kaushal.add(2, -3);
        System.out.println(kaushal);
        // print
        for (int i = 0; i < kaushal.size(); i++) {
		     System.out.println(kaushal.get(i) + " ");	
		}
        System.out.println();
        int[] arr = new int[5];
        for(int v : arr) {
        	System.out.println(v + " ");
        }
        System.out.println();
        for (int v : kaushal) {
        	System.out.println(v + " ");
        }
	}

}
