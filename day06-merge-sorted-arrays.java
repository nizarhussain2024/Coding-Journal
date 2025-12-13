/**
 * Problem: Merge Sorted Arrays
 * Difficulty: Easy
 * 
 * Problem Statement:
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
 * and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 * Merge nums2 into nums1 as one sorted array.
 * 
 * Approach:
 * Use two pointers starting from the end of both arrays.
 * Compare and place larger elements at the end of nums1.
 * 
 * Time Complexity: O(m + n)
 * Space Complexity: O(1)
 */

public class MergeSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
    
    public static void main(String[] args) {
        MergeSortedArrays solution = new MergeSortedArrays();
        
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        solution.merge(nums1, 3, nums2, 3);
        System.out.println(java.util.Arrays.toString(nums1)); // [1, 2, 2, 3, 5, 6]
        
        int[] nums3 = {1};
        int[] nums4 = {};
        solution.merge(nums3, 1, nums4, 0);
        System.out.println(java.util.Arrays.toString(nums3)); // [1]
    }
}


