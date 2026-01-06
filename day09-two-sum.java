/**
 * Problem: Two Sum
 * Difficulty: Easy
 * 
 * Problem Statement:
 * Given an array of integers nums and an integer target, return indices of the
 * two numbers such that they add up to target. You may assume that each input
 * would have exactly one solution, and you may not use the same element twice.
 * 
 * Approach:
 * Use HashMap to store complement values for O(n) time complexity.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        
        return new int[]{};
    }
    
    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        
        int[] test1 = {2, 7, 11, 15};
        int[] result1 = solution.twoSum(test1, 9);
        System.out.println("[" + result1[0] + ", " + result1[1] + "]"); // [0, 1]
        
        int[] test2 = {3, 2, 4};
        int[] result2 = solution.twoSum(test2, 6);
        System.out.println("[" + result2[0] + ", " + result2[1] + "]"); // [1, 2]
        
        int[] test3 = {3, 3};
        int[] result3 = solution.twoSum(test3, 6);
        System.out.println("[" + result3[0] + ", " + result3[1] + "]"); // [0, 1]
    }
}



