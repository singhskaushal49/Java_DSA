package Lec8;

import java.util.Scanner;

public class Trapping_Rain_Water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
        System.out.println(Trapping(arr));
	}
	public static int Trapping(int[] arr) {
		int n = arr.length;
		// 1. steps left max
		int[]left = new int [arr.length];
		left[0] = arr[0];
		for(int i = 1; i < left.length; i++) {
			left[i] = Math.max(left[i - 1], arr[i]);
		}
		// 2. steps right max
		int[] right = new int[arr.length];
		right[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			right[i] = Math.max(right[i + 1], arr[i]);
		}
		
		// 3. area calculate krena ha
		int ans = 0;
		for (int i = 0; i < right.length; i++) {
			ans = ans + Math.min(left[i], right[i]) - arr[i];
		}
		return ans;
	}

}
