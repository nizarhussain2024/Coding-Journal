/**
 * Problem: Binary Search
 * Difficulty: Easy
 * 
 * Problem Statement:
 * Given an array of integers nums which is sorted in ascending order,
 * and an integer target, write a function to search target in nums.
 * If target exists, then return its index. Otherwise, return -1.
 * 
 * Approach:
 * Use binary search algorithm - divide and conquer.
 * 
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

public class BinarySearch {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        BinarySearch solution = new BinarySearch();
        
        int[] test1 = {-1, 0, 3, 5, 9, 12};
        System.out.println(solution.search(test1, 9)); // 4
        
        int[] test2 = {-1, 0, 3, 5, 9, 12};
        System.out.println(solution.search(test2, 2)); // -1
        
        int[] test3 = {5};
        System.out.println(solution.search(test3, 5)); // 0
    }
}
