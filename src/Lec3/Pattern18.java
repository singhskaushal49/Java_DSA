package Lec3;
import java.util.*;
public class Pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner Sc = new Scanner(System.in);
	          int n = Sc.nextInt();
	          
	          int row = 1;
	          int space = n - 1;
	          int star = 1;
	          
	          while(row <= 2 * n - 1) {
	              // space
	              int i = 1;
	              while (i <= space) {
	                  System.out.print("  ");
	                  i++;
	              }
	              // star
	              int j = 1;
	              while (j <= star) {
	                  System.out.print("* ");
	                  j++;
	              }
	              row++;
	              if (row <= n){
	                star = star + 2;
	                space--;
	              } else {
	                star = star - 2;
	                space++;
	              }
	              System.out.println();
	        }
	}

}
