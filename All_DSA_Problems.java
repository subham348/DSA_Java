001

class Solution {
    /*
    53. Maximum Sum Subarray [Kadane's Algorithm]
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

-------------------------


002

class Solution {
    /*
    121. Best Time to Buy and Sell Stock
    You are given an array prices where prices[i] is the price of a given stock on the ith day.
    You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
    Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
    */
    public int maxProfit(int[] prices) {
        int ans = 0, minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            ans = Math.max(ans, prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return ans;
    }
}

-------------------------


003

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

-------------------------


