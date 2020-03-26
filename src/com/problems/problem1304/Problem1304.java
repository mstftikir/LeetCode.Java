/*1304. Find N Unique Integers Sum up to Zero

Given an integer n, return any array containing n unique integers such that they add up to 0.

 

Example 1:

Input: n = 5
Output: [-7,-1,1,3,4]
Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
Example 2:

Input: n = 3
Output: [-1,0,1]
Example 3:

Input: n = 1
Output: [0]
 

Constraints:

1 <= n <= 1000
Accepted
25,964
Submissions
34,048
 * */

package com.problems.problem1304;

public class Problem1304 {

	public static void main(String[] args) {
		var instance = new Problem1304();
		
		var input = 4;
		
		int [] result = instance.sumZero(input);
		
		for (int i : result) {
			System.out.println(i);
		}
	}
	
    public int[] sumZero(int n) {
    	int [] result = new int[n];
    	
    	if(n % 2 == 0) {
        	for (int i = 0 ; i < n ; i +=2) {
				result[i] = i + 1;
				result[i+1] = -(i + 1);				
			}	
    	}
    	else {
    		result[0] = 0;
        	for (int i = 1 ; i < n ; i +=2) {
				result[i] = i + 1;
				result[i+1] = -(i + 1);				
			}	
    	}
    	
    	return result;
    }

}
