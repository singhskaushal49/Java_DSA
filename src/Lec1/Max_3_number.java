package Lec1;

public class Max_3_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x = 38;
        int y = 49;
        int z = 34;
        
        if (x >= y & x >= z) {
        	System.out.println(x);
        }
        else if( y >= x && y >= z){
        	System.out.println(y);
        }
        else {
        	System.out.println(z);
        }
	}

}
