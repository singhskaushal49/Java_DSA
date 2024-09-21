package Lec44;

import java.util.Arrays;

public class Valentine_Magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] boys = { 2, 11, 3 };
		int[] girls = { 5, 7, 3, 2 };
		Arrays.sort(boys);
		Arrays.sort(girls);
		System.out.println(Mini_Sum(boys, girls, 0, 0));
	}

	public static int Mini_Sum(int[] boys, int[] girls, int i, int j) {
		if (i == boys.length) {
			return 0;
		}
		if (j == girls.length) {
			return 999999;
		}

		int s = Math.abs(boys[i] - girls[j]) + Mini_Sum(boys, girls, i + 1, j + 1);
		int r = Mini_Sum(boys, girls, i, j + 1);
		return Math.min(r, s);
	}

}