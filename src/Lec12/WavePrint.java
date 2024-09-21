package Lec12;
import java.util.Scanner;

public class WavePrint {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	       
	        int rows = scanner.nextInt();
	      
	        int cols = scanner.nextInt();

	        int[][] array = new int[rows][cols];
	       
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                array[i][j] = scanner.nextInt();
	            }
	        }

	        Wave(array);
	    }
	

	 public static void Wave(int[][] arr) {
			for (int c = 0; c < arr[0].length; c++) {
				if (c % 2 == 0) {
					for (int r = 0; r < arr.length; r++) {
						System.out.print(arr[r][c]+",");
					}
				} else {
					for (int r = arr.length - 1; r >= 0; r--) {
						System.out.print(arr[r][c]+",");
                }
			   System.out.print("End");
            }
        }
    }
}
