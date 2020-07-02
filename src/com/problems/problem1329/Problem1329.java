/*1329. Sort the Matrix Diagonally

Given a m * n matrix mat of integers, sort it diagonally in ascending order from the top-left to the bottom-right then return the sorted array.



Example 1:


Input: mat = [[3,3,1,1],[2,2,1,2],[1,1,1,2]]
Output: [[1,1,1,1],[1,2,2,2],[1,2,3,3]]


Constraints:

m == mat.length
n == mat[i].length
1 <= m, n <= 100
1 <= mat[i][j] <= 100
* */

package com.problems.problem1329;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Problem1329 {
    public static void main(String[] args) {
        Problem1329 instance = new Problem1329();

        int[][] input = {
                {3, 3, 1, 1},
                {2, 2, 1, 2},
                {1, 1, 1, 2}
        };

        int[][] result = instance.diagonalSort(input);

        for (int[] ints : result) {
            System.out.println(Arrays.toString(ints));

        }
    }

    @SuppressWarnings("ConstantConditions")
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        HashMap<Integer, PriorityQueue<Integer>> d = new HashMap<>();
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                d.putIfAbsent(i - j, new PriorityQueue<>());
                d.get(i - j).add(mat[i][j]);
            }
        }

        for (int i = 0; i < m; ++i)
            for (int j = 0; j < n; ++j)
                mat[i][j] = d.get(i - j).poll();
        return mat;
    }
}
