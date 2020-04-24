/*1200. Minimum Absolute Difference

Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two elements.

Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows

a, b are from arr
a < b
b - a equals to the minimum absolute difference of any two elements in arr


Example 1:

Input: arr = [4,2,1,3]
Output: [[1,2],[2,3],[3,4]]
Explanation: The minimum absolute difference is 1. List all pairs with difference equal to 1 in ascending order.
Example 2:

Input: arr = [1,3,6,10,15]
Output: [[1,3]]
Example 3:

Input: arr = [3,8,-10,23,19,-4,-14,27]
Output: [[-14,-10],[19,23],[23,27]]


Constraints:

2 <= arr.length <= 10^5
-10^6 <= arr[i] <= 10^6
* */

package com.problems.problem1200;

import java.io.*;
import java.util.*;

public class Problem1200 {
    public static void main(String[] args) throws IOException {
        Problem1200 instance = new Problem1200();

        File file = new File(System.getProperty("user.dir") + "\\src\\com\\problems\\problem1200\\input.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String s = br.readLine();

        String[] inputS = s.split(",");

        int[] input = new int[inputS.length];

        for (int i = 0; i < inputS.length; i++) {
            input[i] = new Integer(inputS[i]);
        }

        List<List<Integer>> result = instance.minimumAbsDifference(input);

        for (List<Integer> l : result) {
            System.out.println(l);
        }
    }

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> l = new LinkedList<>();
        int min = Integer.MAX_VALUE;
        List<Integer> curr;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == min) {
                curr = new ArrayList<>(2);
                curr.add(arr[i]);
                curr.add(arr[i + 1]);
                l.add(curr);
            } else if (arr[i + 1] - arr[i] < min) {
                l.clear();
                curr = new ArrayList<>(2);
                curr.add(arr[i]);
                curr.add(arr[i + 1]);
                l.add(curr);

                min = arr[i + 1] - arr[i];
            }
        }

        return l;
    }

}
