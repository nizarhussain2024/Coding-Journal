/**
 * Problem: Reverse String
 * Difficulty: Easy
 * 
 * Problem Statement:
 * Write a function that reverses a string.
 * The input string is given as an array of characters s.
 * 
 * Approach:
 * Use two pointers - one at start, one at end.
 * Swap characters and move pointers towards center.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class ReverseString {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
    
    public static void main(String[] args) {
        ReverseString solution = new ReverseString();
        
        char[] test1 = {'h', 'e', 'l', 'l', 'o'};
        solution.reverseString(test1);
        System.out.println(test1); // "olleh"
        
        char[] test2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        solution.reverseString(test2);
        System.out.println(test2); // "hannaH"
    }
}



