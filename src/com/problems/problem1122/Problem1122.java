/*1122. Relative Sort Array

Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.

Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2.  Elements that don't appear in arr2 should be placed at the end of arr1 in ascending order.



Example 1:

Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
Output: [2,2,2,1,4,3,3,9,6,7,19]


Constraints:

arr1.length, arr2.length <= 1000
0 <= arr1[i], arr2[i] <= 1000
Each arr2[i] is distinct.
Each arr2[i] is in arr1.
* */

package com.problems.problem1122;

import java.util.*;

public class Problem1122 {
    public static void main(String[] args) {
        Problem1122 instance = new Problem1122();

        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19}, arr2 = {2, 1, 4, 3, 9, 6};

        int[] result = instance.relativeSortArray(arr1, arr2);

        for (int i : result) {
            System.out.println(i);
        }
    }

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        Map<Integer, Integer> map = new TreeMap<>();
        List<Integer> resultList = new LinkedList<>();

        for (int i : arr1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        //Numbers in arr1 addition to list
        Integer currVal;
        for (int i : arr2) {
            currVal = map.get(i);
            for (int j = 0; j < currVal; j++) {
                resultList.add(i);
            }
            map.remove(i);
        }

        //Numbers not in arr1 addition to list
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            for (int i = 0; i < e.getValue(); i++) {
                resultList.add(e.getKey());
            }
        }

        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}
