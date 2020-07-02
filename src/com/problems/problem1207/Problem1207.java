/*1207. Unique Number of Occurrences

Given an array of integers arr, write a function that returns true if and only if the number of occurrences of each value in the array is unique.

Example 1:

Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
Example 2:

Input: arr = [1,2]
Output: false
Example 3:

Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true


Constraints:

1 <= arr.length <= 1000
-1000 <= arr[i] <= 1000
* */

package com.problems.problem1207;

import java.util.*;

public class Problem1207 {
    public static void main(String[] args) {
        Problem1207 instance = new Problem1207();

        int [] input = {1,2,2,1,1,3};

        boolean result = instance.uniqueOccurrences(input);

        System.out.println(result);
    }

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i : arr){
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            }
            else{
                map.put(i, 1);
            }

        }

        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            for(Map.Entry<Integer, Integer> n : map.entrySet()){
                if(!m.getKey().equals(n.getKey()) && m.getValue().equals(n.getValue())){
                    return false;
                }
            }
        }

        return true;
    }
}
