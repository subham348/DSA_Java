class Solution {
    /*
    53. Maximum Subarray [Kadane's Algorithm]
    Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
    */
    public int maxSubArray(int[] nums) {
        int ans = nums[0], curr = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (curr < 0) {
                curr = 0;
            }
            curr += nums[i];
            if (curr > ans) {
                ans = curr;
            }
        }
        return ans;
    }
}