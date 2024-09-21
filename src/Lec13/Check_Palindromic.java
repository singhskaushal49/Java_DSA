package Lec13;

import java.util.Iterator;

public class Check_Palindromic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "nitin";
        System.out.println(isPalindrom(s));
	}
	public static boolean isPalindrom(String s) {
		int i = 0;
		int j  = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;	
	}
 }


