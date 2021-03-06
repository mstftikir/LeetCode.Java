/*1252. Cells with Odd Values in a Matrix

Given n and m which are the dimensions of a matrix initialized by zeros and given an array indices where indices[i] = [ri, ci]. For each pair of [ri, ci] you have to increment all cells in row ri and column ci by 1.

Return the number of cells with odd values in the matrix after applying the increment to all indices.

 

Example 1:


Input: n = 2, m = 3, indices = [[0,1],[1,1]]
Output: 6
Explanation: Initial matrix = [[0,0,0],[0,0,0]].
After applying first increment it becomes [[1,2,1],[0,1,0]].
The final matrix will be [[1,3,1],[1,3,1]] which contains 6 odd numbers.
Example 2:


Input: n = 2, m = 2, indices = [[1,1],[0,0]]
Output: 0
Explanation: Final matrix = [[2,2],[2,2]]. There is no odd number in the final matrix.
 

Constraints:

1 <= n <= 50
1 <= m <= 50
1 <= indices.length <= 100
0 <= indices[i][0] < n
0 <= indices[i][1] < m
 * */

package com.problems.problem1252;

public class Problem1252 {

	public static void main(String[] args) {
		Problem1252 instance = new Problem1252();

		int n = 2, m = 3;
		int[][] indices = { { 0, 1 }, { 1, 1 } };

		int result = instance.oddCells(n, m, indices);

		System.out.println(result);

	}

	public int oddCells(int n, int m, int[][] indices) {
		int[][] result = new int[n][m];

		int row, col;
		for (int[] index : indices) {

			row = index[0];
			for (int j = 0; j < m; j++) {
				result[row][j]++;
			}

			col = index[1];
			for (int j = 0; j < n; j++) {
				result[j][col]++;
			}
		}

		int counter = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (result[i][j] % 2 == 1) {
					counter++;
				}
			}
		}

		return counter;
	}

}
