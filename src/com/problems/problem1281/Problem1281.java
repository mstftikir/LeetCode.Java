/*1281. Subtract the Product and Sum of Digits of an Integer
 
Given an integer number n, return the difference between the product of its digits and the sum of its digits.
 

Example 1:

Input: n = 234
Output: 15 
Explanation: 
Product of digits = 2 * 3 * 4 = 24 
Sum of digits = 2 + 3 + 4 = 9 
Result = 24 - 9 = 15
Example 2:

Input: n = 4421
Output: 21
Explanation: 
Product of digits = 4 * 4 * 2 * 1 = 32 
Sum of digits = 4 + 4 + 2 + 1 = 11 
Result = 32 - 11 = 21
 

Constraints:

1 <= n <= 10^5
 * */
package com.problems.problem1281;

public class Problem1281 {

	public static void main(String[] args) {
		var instance = new Problem1281();
		
		var input = 234;
		
		var result = instance.subtractProductAndSum(input);
		
		System.out.println(result);
	}

    public int subtractProductAndSum(int n) {
    	int product = 1, sum = 0, figure = 0;
    	
    	while(n > 0) {
    		figure = n % 10;
    		n /= 10;
    		
    		product *= figure;
    		sum += figure;	
    	}
    	
    	return product - sum;
    }
}