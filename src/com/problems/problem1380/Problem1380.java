/*1380. Lucky Numbers in a Matrix

Given a m * n matrix of distinct numbers, return all lucky numbers in the matrix in any order.

A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.



Example 1:

Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
Output: [15]
Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column
Example 2:

Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
Output: [12]
Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.
Example 3:

Input: matrix = [[7,8],[1,2]]
Output: [7]


Constraints:

m == mat.length
n == mat[i].length
1 <= n, m <= 50
1 <= matrix[i][j] <= 10^5.
All elements in the matrix are distinct.
* */

package com.problems.problem1380;

import java.util.LinkedList;
import java.util.List;

public class Problem1380 {
    public static void main(String[] args) {
        var instance = new Problem1380();

        int[][] input =
                        {{1,10,4,2},
                        {9,3,8,7},
                        {15,16,17,12}};

        List<Integer> result = instance.luckyNumbers(input);

        for (var l : result) {
            System.out.println(l);
        }

    }

    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> minRow = new LinkedList<>();
        List<Integer> maxCol = new LinkedList<>();

        Integer min, max;
        for (int i = 0; i < matrix.length; i++) {
            min = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                }
            }

            minRow.add(min);
        }

        for (int i = 0; i < matrix[0].length; i++) {
            max = Integer.MIN_VALUE;

            for (int j = 0; j < matrix.length; j++) {
                if(matrix[j][i] > max){
                    max = matrix[j][i];
                }
            }

            maxCol.add(max);
        }

        List<Integer> lucky = new LinkedList<>();
        for (int [] i : matrix){
            for(int j : i){
                if(minRow.contains(j) && maxCol.contains(j)){
                    lucky.add(j);
                }
            }
        }

        return lucky;
    }

}
