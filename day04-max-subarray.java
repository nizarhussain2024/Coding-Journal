/**
 * Problem: Maximum Subarray (Kadane's Algorithm)
 * Difficulty: Medium
 * 
 * Problem Statement:
 * Given an integer array nums, find the contiguous subarray 
 * (containing at least one number) which has the largest sum and return its sum.
 * 
 * Approach:
 * Use Kadane's algorithm - track maximum sum ending at current position.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class MaxSubarray {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }
    
    public static void main(String[] args) {
        MaxSubarray solution = new MaxSubarray();
        
        int[] test1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(solution.maxSubArray(test1)); // 6
        
        int[] test2 = {1};
        System.out.println(solution.maxSubArray(test2)); // 1
        
        int[] test3 = {5, 4, -1, 7, 8};
        System.out.println(solution.maxSubArray(test3)); // 23
    }
}

