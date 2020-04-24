/*344. Reverse String
Write a function that reverses a string. The input string is given as an array of characters char[].

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

You may assume all the characters consist of printable ascii characters.



Example 1:

Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
* */

package com.problems.problem344;

public class Problem344 {
    public static void main(String[] args) {
        Problem344 instance = new Problem344();

        char[] input = {'h','e','l','l','o'};

        String result = instance.reverseString(input);

        System.out.println(result);
    }
    public String reverseString(char[] s) {
        char temp;
        int size = s.length;
        for (int i = 0; i < (size + 1) / 2; i++) {
            temp = s[i];
            s[i] = s[size - i - 1];
            s[size - i - 1] = temp;
        }

        return new String(s);
    }
}
