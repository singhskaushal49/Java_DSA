package Lec10;

public class First_Bad_Version {

	public int firstBadVersion(int n) {
		// TODO Auto-generated method stub
		int lo = 1;
		int hi = n;
		int ans = 0;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (isBadVersion(mid)) {
				ans = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		return ans;
	}

	private static boolean isBadVersion(int mid) {
		// TODO Auto-generated method stub
		return false;
	}

}
