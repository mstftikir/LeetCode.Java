/*942. DI String Match

Given a string S that only contains "I" (increase) or "D" (decrease), let N = S.length.

Return any permutation A of [0, 1, ..., N] such that for all i = 0, ..., N-1:

If S[i] == "I", then A[i] < A[i+1]
If S[i] == "D", then A[i] > A[i+1]


Example 1:

Input: "IDID"
Output: [0,4,1,3,2]
Example 2:

Input: "III"
Output: [0,1,2,3]
Example 3:

Input: "DDI"
Output: [3,2,0,1]


Note:

1 <= S.length <= 10000
S only contains characters "I" or "D".
* */

package com.problems.problem942;

public class Problem942 {

    public static void main(String[] args) {
        Problem942 instance = new Problem942();

        String input = "IDID";

        int [] result = instance.diStringMatch(input);

        for(int i : result){
            System.out.println(i);
        }
    }
    public int[] diStringMatch(String S) {
        int len = S.length(), lowerBound = 0, upperBound = len;

        int [] result = new int [len + 1];

        for (int i = 0; i < len; i++) {
            if(S.charAt(i) == 'I'){
                result[i] = lowerBound++;
            }
            else{
                result[i] = upperBound--;
            }
        }

        if(S.charAt(len - 1) == 'I'){
            result[len] = lowerBound;
        }
        else{
            result[len] = upperBound;
        }

        return result;
    }
}
