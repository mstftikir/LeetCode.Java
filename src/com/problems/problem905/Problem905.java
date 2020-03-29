/*905. Sort Array By Parity

Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.

You may return any answer array that satisfies this condition.



Example 1:

Input: [3,1,2,4]
Output: [2,4,3,1]
The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.


Note:

1 <= A.length <= 5000
0 <= A[i] <= 5000
* */

package com.problems.problem905;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Problem905 {
    public static void main(String [] args){
        var instance = new Problem905();

        int [] input = {3,1,2,4};

        int [] result = instance.sortArrayByParity(input);

        for(int i : result){
            System.out.println(i);
        }
    }
    public int[] sortArrayByParity(int[] A) {
        List<Integer> list = new ArrayList<>(A.length);

        for(int i : A){
            if(i % 2 == 0){
                list.add(0, i);
            }
            else{
                list.add(list.size(), i);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            A[i] = list.get(i);
        }

        return A;
    }
}
