/*1365. How Many Numbers Are Smaller Than the Current Number
Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

Return the answer in an array.

Example 1:

Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]
Explanation: 
For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3). 
For nums[1]=1 does not exist any smaller number than it.
For nums[2]=2 there exist one smaller number than it (1). 
For nums[3]=2 there exist one smaller number than it (1). 
For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
Example 2:

Input: nums = [6,5,4,8]
Output: [2,1,0,3]
Example 3:

Input: nums = [7,7,7,7]
Output: [0,0,0,0]
 

Constraints:

2 <= nums.length <= 500
0 <= nums[i] <= 100

 * */

package com.problems.problem1365;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Problem1365 {

	public static void main(String[] args) {
		Problem1365 instance = new Problem1365();
		
		int[] input= {8,1,2,2,3};

		int[] result = instance.smallerNumbersThanCurrent(input);
		
		for (int i : result) {
			System.out.println(i);
		}

	}
	
	// O(n) solution using sort
    public int[] smallerNumbersThanCurrent(int[] nums) {
    	Integer[] copy =  new Integer[nums.length];
    	
    	for (int i = 0; i < nums.length; i++) {
			copy[i] = nums[i];
		}
    	
    	List<Integer> list = Arrays.asList(copy);
    	
    	Collections.sort(list);
    	
    	for (int i = 0; i < nums.length; i++) {
			nums[i] = list.indexOf(nums[i]);
		}
    	
    	return nums;
    }
    
	/* O(n^2) solution
    public int[] smallerNumbersThanCurrent(int[] nums) {
    	int result[] = new int [nums.length];
    	
    	for (int i = 0; i < nums.length; i++) {
			for (int j = 0 ;j < nums.length ; j++) {
				if(nums[i] > nums[j]) {
					result[i]++;
				}
			}
		}
    	
    	return result;
    }
    */
}
