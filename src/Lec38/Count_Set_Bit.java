package Lec38;

public class Count_Set_Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n = 84;
        System.out.println(CountSetBit(n));
        System.out.println(Fast_CountBit(n));
	}

	private static int Fast_CountBit(int n) {
		// TODO Auto-generated method stub
		int c = 0;
		while (n > 0) {
			n = (n & (n - 1));
			c++;
		}
		return c;
	}

	private static int CountSetBit(int n) {
		// TODO Auto-generated method stub
		int c = 0;
		while (n > 0) {
			if ((n & 1) != 0) {
				c++;
			}
			n >>= 1; // n = n >> 1;
		}
		return c;
	}

}
