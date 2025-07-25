package Lecture17;
// Problem Link :- https://leetcode.com/problems/first-bad-version/
public class FirstBadVersion {
	static int bad = 3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(firstBadVersion(n));
	}
	
	public static boolean isBadVersion(int version) {
		if(version >= bad) {
			return true;
		}
		
		return false;
	}
	
	public static int firstBadVersion(int n) {
        int low = 1;
		int high = n;
        int ans = -1;
		while(low <= high) {
			int mid = low + (high - low) / 2;
			if(isBadVersion(mid)) {
				ans = mid; // mid is the position where the target element is present
                high = mid - 1;
			} else {
                low = mid+1;
			}
		}
		
		return ans; // -1 indicates target element is not present in the array
    }

}
