package Lecture16;
// Problem Link :- https://leetcode.com/problems/maximum-subarray/
public class MaximumSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,3,-9,7,8};
		System.out.println(maxSubArray(arr));
	}
	
	// Optimal Code 
	// this is Kadane's Algorithm
	public static int maxSubArray(int[] nums) {
        // [-5,-4,-3,-9,-3] ---> max = -3
        // Kadane's Algorithm
        int ans = Integer.MIN_VALUE;  // int ka sabse minimum value -2^31
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            ans = Math.max(ans, sum);

            // prepare for the next value
            if(sum < 0) {
                sum = 0;
            }
        }
        return ans;
    }
	
	// Brue Force
//    public int maxSubArray(int[] nums) {
//        // [-5,-4,-3,-9,-3] ---> max = -3
//        int ans = Integer.MIN_VALUE;  // int ka sabse minimum value -2^31
//        for(int i = 0; i < nums.length; i++) {
//            int sum = 0;
//            for(int j = i; j < nums.length; j++) {
//                sum = sum + nums[j];
//                ans = Math.max(ans, sum);
//            }
//        }
//
//        return ans;
//    }
}
