package Lec2;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n = 5;
        int star = n;
        int row =1;
        while(row <= n) {
        	//star
        	int i = 1;
        	while(i <=n ) {
        		System.out.print("* ");
        		i++;
        	}  
        	// next row
        	System.out.println();
        	row++;
        }
	}
}

