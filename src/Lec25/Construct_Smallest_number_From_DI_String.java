package Lec25;

import java.util.Iterator;
import java.util.Stack;

public class Construct_Smallest_number_From_DI_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "IIIDIDDD";
        System.out.println(Construct_Smallest(s));
	}

	public static String Construct_Smallest(String s) {
		// TODO Auto-generated method stub
	    int[] arr = new int[s.length() + 1];
	    Stack<Integer> st = new Stack<>();
	    int c = 1;
	    for (int i = 0; i < arr.length; i++) {
			if(i==s.length() || s.charAt(i) == 'I') {
				arr[i]=c;
				c++;
				while(!st.isEmpty()) {
					arr[st.pop()] = c;
					c++;
				}
			} else {
				st.push(i);
			}
		}
	    String ans = "";
	    for (int i = 0; i < arr.length; i++) {
			ans = ans + arr[i];
		}
	    return ans; 
	}

}
