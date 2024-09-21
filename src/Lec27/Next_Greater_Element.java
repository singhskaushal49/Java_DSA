package Lec27;

import java.util.Stack;

public class Next_Greater_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] arr = { 50, 5, 3, 2, 8, 7, 9, 11, 3};
        NGE(arr);
	}
	public static void NGE(int[] arr) {
		int [] ans = new int [arr.length];
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < ans.length; i++) {
			while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
				ans[st.pop()]=arr[i];
			}
			st.push(i);	
		}
		while (!st.isEmpty()) {
			ans[st.pop()] = -1;
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.println(arr[i] + "," + ans[i]);
		}
	}
}

// https://codeskiller.codingblocks.com/problems/1053


