package Lec13;

import java.util.Iterator;

public class String_LexcoGraphic_Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1 = "Komal";
        String s2 = "Kamal";
       System.out.println(s1.compareTo(s2));
//        String s3 = "raj";
//        String s4 = "rajesh";
//        System.out.println(s3.compareTo(s4));
//        String s5 = "kaju";
//        String s6 = "raju";
//        System.out.println(s5.compareTo(s6));
       
        
	}
	public static int compare(String s1, String s2) {
		if (s1 == s2) {
			return 0;
		}
		int min = Math.min(s1.length(), s2.length());{
	    for (int i = 0;i < min; i++) {
			return s1.charAt(i) - s2.charAt(i); 	
		   }
		}
		return s1.length() - s2.length();
	}

}

