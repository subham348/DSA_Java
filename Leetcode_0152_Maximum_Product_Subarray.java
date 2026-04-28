class Solution {
    /*
    152. Maximum Product Subarray
    Given an integer array nums, find a contiguous non-empty subarray within the array that has the largest product, and return the product.
    */
    public int maxProduct(int[] nums) {
        int res = nums[0], maxProduct = nums[0], minProduct = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= 0) {
                maxProduct = Math.max(nums[i], maxProduct * nums[i]);
                minProduct = Math.min(nums[i], minProduct * nums[i]);
            } else {
                int temp = maxProduct;
                maxProduct = Math.max(nums[i], minProduct * nums[i]);
                minProduct = Math.min(nums[i], temp * nums[i]);
            }
            res = Math.max(res, maxProduct);
        }
        return res;
    }
}
