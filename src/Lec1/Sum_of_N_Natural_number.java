package Lec1;

public class Sum_of_N_Natural_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n = 10;
        int i = 1;
        int sum = 0;
        
        while (i <= n) {
        	sum += i;
        	i++;
        }
        System.out.println(sum);
	}

}
