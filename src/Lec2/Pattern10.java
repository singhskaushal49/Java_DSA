package Lec2;
import java.util.*;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		int n = Sc.nextInt();
		int space = 0;
		int star = 2 * n - 1;
		int row = 1;

		while (row <= n) {
			// Space
			int i = 1;
			while (i <= space) {
				System.out.print(" ");
				i++;
			}
			// Star
			int j = 1;
			while (j <= star) {
				System.out.print("*");
				j++;
			}
			// next line prepration
			row++;
			star -= 2;
			space++;
			System.out.println();
		}
	}

}
