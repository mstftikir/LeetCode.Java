/*1394. Find Lucky Integer in an Array

Given an array of integers arr, a lucky integer is an integer which has a frequency in the array equal to its value.

Return a lucky integer in the array. If there are multiple lucky integers return the largest of them. If there is no lucky integer return -1.



Example 1:

Input: arr = [2,2,3,4]
Output: 2
Explanation: The only lucky number in the array is 2 because frequency[2] == 2.
Example 2:

Input: arr = [1,2,2,3,3,3]
Output: 3
Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.
Example 3:

Input: arr = [2,2,2,3,3]
Output: -1
Explanation: There are no lucky numbers in the array.
Example 4:

Input: arr = [5]
Output: -1
Example 5:

Input: arr = [7,7,7,7,7,7,7]
Output: 7
* */
package com.problems.problem1394;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Problem1394 {
    public static void main(String[] args) {
        var instance = new Problem1394();

        //{2,2,3,4};
        int [] input = {5,4,7,8,4,8,8,3,7,7,6,3,7,6,5,6,8,4,5,7,4,7,7,5,2,5,6,6,8,1,6,8,8,8,9,3,2,9};

        int result = instance.findLucky(input);

        System.out.println(result);
    }

    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());

        for (int i : arr) {
            if(!map.containsKey(i)){
                map.put(i, 1);
            }
            else{
                map.put(i, map.get(i) + 1);
            }
        }

        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if((e.getKey()).equals(e.getValue())){
                return e.getValue();
            }
        }

        return -1;
    }
}
