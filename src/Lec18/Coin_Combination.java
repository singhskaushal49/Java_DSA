package Lec18;

public class Coin_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] coin = {1, 2, 3};
        int amount = 5;
     //   Permutation(coin, amount," ",0);
	}
	public static void Permutation(int[] coin, int amount, String ans,int idx) {
		if (amount == 0) {
			System.out.println(ans);
			return;
		}
		
		for (int i = idx; i < coin.length; i++) {
			if (amount >= coin[i]) {
				Permutation(coin, amount - coin[i], ans + coin[i],i);
			}
		}
	}
}
