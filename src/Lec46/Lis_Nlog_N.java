package Lec46;

public class Lis_Nlog_N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = { 0, 8, 4, 2, 12, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };
        System.out.println(lis(arr));
	}
    public static int lis(int[] arr) {
    	int[] lis = new int[arr.length];
    	lis[0] = arr[0];
    	int len = 1;
    	for (int i = 0; i < lis.length; i++) {
			if(lis[len - 1] < arr[i]) {
				  lis[len] = arr[i];
				  len++;
			} else {
				int idx = Search(lis, 0, len - 1, arr[i]);
				lis[idx] = arr[i];
			}
		}
    	return len;
    }
    private static int Search(int[] lis, int si, int ei, int item) {
    	int ans = 0;
    	while (si <= ei) {
    		int mid = (si + ei) / 2;
    		if (lis[mid] >= item) {
    			ans = mid;
    			ei = mid - 1;
    		} else {
    			si = mid + 1;
    		}
    	}
    	return ans;
    }
}
