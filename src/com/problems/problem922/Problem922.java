/*922. Sort Array By Parity II

Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even.

Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.

You may return any answer array that satisfies this condition.



Example 1:

Input: [4,2,5,7]
Output: [4,5,2,7]
Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.


Note:

2 <= A.length <= 20000
A.length % 2 == 0
0 <= A[i] <= 1000
* */

package com.problems.problem922;

import java.util.*;

public class Problem922 {
    public static void main(String[] args) {
        Problem922 instance = new Problem922();

        int[] input = {4, 2, 5, 7};

        int[] result = instance.sortArrayByParityII(input);

        for (int i : result) {
            System.out.println(i);
        }
    }

    public int[] sortArrayByParityII(int[] A) {
        List<Integer> listEven = new ArrayList<>(A.length / 2);
        List<Integer> listOdd = new ArrayList<>(A.length / 2);

        for (int e : A) {
            if(e % 2 == 0){
                listEven.add(e);
            }
            else{
                listOdd.add(e);
            }
        }

        for (int i = 0; i < A.length; i++) {
            if (i % 2 == 0) {
                A[i] = listEven.remove(0);
            } else {
                A[i] = listOdd.remove(0);
            }
        }

        return A;
    }
}
