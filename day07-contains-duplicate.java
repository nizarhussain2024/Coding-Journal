/**
 * Problem: Contains Duplicate
 * Difficulty: Easy
 * 
 * Problem Statement:
 * Given an integer array nums, return true if any value appears at least twice
 * in the array, and return false if every element is distinct.
 * 
 * Approach:
 * Use HashSet to track seen elements.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        ContainsDuplicate solution = new ContainsDuplicate();
        
        int[] test1 = {1, 2, 3, 1};
        System.out.println(solution.containsDuplicate(test1)); // true
        
        int[] test2 = {1, 2, 3, 4};
        System.out.println(solution.containsDuplicate(test2)); // false
        
        int[] test3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(solution.containsDuplicate(test3)); // true
    }
}

