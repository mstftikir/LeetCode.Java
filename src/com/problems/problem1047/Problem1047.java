/*1047. Remove All Adjacent Duplicates In String

Given a string S of lowercase letters, a duplicate removal consists of choosing two adjacent and equal letters, and removing them.

We repeatedly make duplicate removals on S until we no longer can.

Return the final string after all such duplicate removals have been made.  It is guaranteed the answer is unique.



Example 1:

Input: "abbaca"
Output: "ca"
Explanation:
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".


Note:

1 <= S.length <= 20000
S consists only of English lowercase letters.
* */

package com.problems.problem1047;

public class Problem1047 {
    public static void main(String[] args) {
        Problem1047 instance = new Problem1047();

        String input = "abbaca";

        String result = instance.removeDuplicates(input);

        System.out.println(result);
    }

    public String removeDuplicates(String S) {
        StringBuilder sb = new StringBuilder(S);
        boolean isFound = true;

        while (isFound){
            isFound = false;
            for (int i = 0; i < sb.length() - 1; i++) {
                if (sb.charAt(i) == sb.charAt(i + 1)) {
                    sb.deleteCharAt(i);
                    sb.deleteCharAt(i);
                    isFound = true;
                    break;
                }
            }
        }

        return sb.toString();
    }
}
