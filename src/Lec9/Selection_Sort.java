package Lec9;

import java.util.Scanner;

public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
        //System.out.println(min_form_ith_index(arr, 2));
        Sort(arr);
        for(int i = 0; i < arr.length; i++) {
        	System.out.print(arr[i] + " ");
        }
	}
	public static void Sort(int[] arr) {
		for (int i = 0; i <arr.length; i++) {
			int idx = min_form_ith_index(arr, i);
			int temp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = temp;
		}
	}
    public static int min_form_ith_index(int[] arr, int i) {
    	
    	int mini = 1;
    	for(int j = i + 1; j < arr.length; j++) {
    	   if (arr[j] < arr[mini]) {
    		   mini = j;
    	   }
    	}
    	return mini;
    }
}
