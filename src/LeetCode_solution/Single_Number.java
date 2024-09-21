package LeetCode_solution;

public class Single_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = { 4, 1, 2, 1, 2 };
        System.out.println(Number(arr));
	}

	private static int Number(int[] arr) {
		// TODO Auto-generated method stub
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans = ans ^ arr[i];
		}
		return ans;
	}

}

// https://leetcode.com/problems/single-number/description/