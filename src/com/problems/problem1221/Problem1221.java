/*1221. Split a String in Balanced Strings

Balanced strings are those who have equal quantity of 'L' and 'R' characters.

Given a balanced string s split it in the maximum amount of balanced strings.

Return the maximum amount of splitted balanced strings.

 

Example 1:

Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
Example 2:

Input: s = "RLLLLRRRLR"
Output: 3
Explanation: s can be split into "RL", "LLLRRR", "LR", each substring contains same number of 'L' and 'R'.
Example 3:

Input: s = "LLLLRRRR"
Output: 1
Explanation: s can be split into "LLLLRRRR".
Example 4:

Input: s = "RLRRRLLRLL"
Output: 2
Explanation: s can be split into "RL", "RRRLLRLL", since each substring contains an equal number of 'L' and 'R'
 

Constraints:

1 <= s.length <= 1000
s[i] = 'L' or 'R'
 * */

package com.problems.problem1221;

public class Problem1221 {

	public static void main(String[] args) {
        Problem1221 instance = new Problem1221();
		
		String input = "RLRRLLRLRL";

        int result = instance.balancedStringSplit(input);
		
		System.out.println(result);
	}
	
    public int balancedStringSplit(String s) {
        int balance = 0, result = 0; 
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'R'){
                balance++;
            }
            else{
                balance--;
            }
            
            if(balance == 0){
                result++;
            }
        }
        
        return result;    
    }

}
