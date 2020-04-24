/*821. Shortest Distance to a Character

Given a string S and a character C, return an array of integers representing the shortest distance from the character C in the string.

Example 1:

Input: S = "loveleetcode", C = 'e'
Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]


Note:

S string length is in [1, 10000].
C is a single character, and guaranteed to be in string S.
All letters in S and C are lowercase.
* */

package com.problems.problem821;

public class Problem821 {
    public static void main(String[] args) {
        Problem821 instance = new Problem821();

        String S = "aaba";
        char c = 'b';

        int[] result = instance.shortestToChar(S, c);

        for (int i :
                result) {
            System.out.println(i);

        }
    }

    public int[] shortestToChar(String S, char C) {
        int len = S.length();
        int diffCounterRight, diffCounterLeft;
        boolean isFoundRight, isFoundLeft;
        int[] result = new int[len];

        for (int i = 0; i < len; i++) {
            if (S.charAt(i) == C) {
                result[i] = 0;
                continue;
            }

            diffCounterRight = 0;
            diffCounterLeft = 0;

            isFoundLeft = false;
            isFoundRight = false;

            //check right
            for (int j = i + 1; j < len; j++) {
                if (S.charAt(j) == C) {
                    diffCounterRight = j - i;
                    isFoundRight = true;
                    break;
                }
            }
            //check left
            for (int j = i - 1; j >= 0; j--) {
                if (S.charAt(j) == C) {
                    diffCounterLeft = i - j;
                    isFoundLeft = true;
                    break;
                }
            }

            if(isFoundLeft && isFoundRight){
                result[i] = Math.min(diffCounterLeft, diffCounterRight);
            }
            else if(isFoundLeft){
                result[i] = diffCounterLeft;
            }
            else if (isFoundRight){
                result[i] = diffCounterRight;
            }

        }

        return result;
    }
}
