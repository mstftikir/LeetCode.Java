/*1480. Running Sum of 1d Array

Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.



Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
Example 2:

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
Example 3:

Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]


Constraints:

1 <= nums.length <= 1000
-10^6 <= nums[i] <= 10^6
* */

package com.problems.problem1480;

public class Problem1480 {
    public static void main(String[] args) {
        Problem1480 instance = new Problem1480();

        int[] input = {1,2,3,4};

        int[] result = instance.runningSum(input);

        for (int i :
                result) {
            System.out.println(i);
        }
    }

    public int[] runningSum(int[] nums) {
        int temp = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] += temp;
            temp = nums[i];
        }

        return nums;
    }
}
