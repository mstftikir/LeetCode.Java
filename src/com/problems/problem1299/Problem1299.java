/*1299. Replace Elements with Greatest Element on Right Side

Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

After doing so, return the array.

 

Example 1:

Input: arr = [17,18,5,4,6,1]
Output: [18,6,6,6,1,-1]
 

Constraints:

1 <= arr.length <= 10^4
1 <= arr[i] <= 10^5
 * */

package com.problems.problem1299;

public class Problem1299 {

	public static void main(String[] args) {
		Problem1299 instance = new Problem1299();

		int [] input = { 17, 18, 5, 4, 6, 1 };

		int [] result = instance.replaceElements(input);
		for (int i : result) {
			System.out.println(i);		
		}
	}
	public int[] replaceElements(int[] arr) {
		
		int size = arr.length, max = Integer.MIN_VALUE, temp;
		
		for (int i = size -1 ; i >= 0; i--) {
			
			temp = arr[i];
			
			arr[i] = max;
				
			max = Math.max(arr[i], temp);
		}

		arr[arr.length - 1] = -1;

		return arr;
	}
	
	/* Brute force O(N ^2) solution
	public int[] replaceElements(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int max = Integer.MIN_VALUE;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > max) {
					max = arr[j];
				}
				arr[i] = max;
			}

		}

		arr[arr.length - 1] = -1;

		return arr;
	}
	*/
}