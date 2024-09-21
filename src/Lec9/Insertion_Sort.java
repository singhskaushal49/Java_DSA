package Lec9;

import java.util.Scanner;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
  //	InsertionLastElement(arr, arr.length - 1);
		Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			    System.out.print(arr[i] + " ");
		 }
	}
	public static void Sort(int[] arr) {
	     for (int j = 1; j < arr.length; j++) {
	    	 InsertionLastElement(arr, j);
		}
	}

	public static void InsertionLastElement(int[] arr, int j) {
         int item = arr[j];
         int i = j - 1;
         while (i >= 0 && arr[i] > item) {
        	 arr[i + 1] = arr[i];
        	 i--;
         }
         arr[i + 1] = item;
	}
}
