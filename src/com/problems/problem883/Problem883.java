/*883. Projection Area of 3D Shapes

On a N * N grid, we place some 1 * 1 * 1 cubes that are axis-aligned with the x, y, and z axes.

Each value v = grid[i][j] represents a tower of v cubes placed on top of grid cell (i, j).

Now we view the projection of these cubes onto the xy, yz, and zx planes.

A projection is like a shadow, that maps our 3 dimensional figure to a 2 dimensional plane.

Here, we are viewing the "shadow" when looking at the cubes from the top, the front, and the side.

Return the total area of all three projections.



Example 1:

Input: [[2]]
Output: 5
Example 2:

Input: [[1,2],[3,4]]
Output: 17
Explanation:
Here are the three projections ("shadows") of the shape made with each axis-aligned plane.

Example 3:

Input: [[1,0],[0,2]]
Output: 8
Example 4:

Input: [[1,1,1],[1,0,1],[1,1,1]]
Output: 14
Example 5:

Input: [[2,2,2],[2,1,2],[2,2,2]]
Output: 21
* */

package com.problems.problem883;

public class Problem883 {
    public static void main(String[] args) {
        var instance = new Problem883();

        int[][] grid = {{1,1,1}, {1,0,1}, {1,1,1}};

        int result = instance.projectionArea(grid);

        System.out.println(result);
    }
    public int projectionArea(int[][] grid) {
        return topView(grid) + frontView(grid) + sideView(grid);
    }

    private int topView(int[][] grid){
        int zeroCount = 0;

        for(int [] i: grid){
            for(int j: i){
                if(j == 0){
                    zeroCount++;
                }
            }
        }

        return (grid.length * grid[0].length) - zeroCount;
    }

    private int frontView(int [][] grid){
        int result = 0, currMax;

        for (int[] ints : grid) {
            currMax = 0;
            for (int anInt : ints) {
                if (anInt > currMax) {
                    currMax = anInt;
                }
            }
            result += currMax;
        }

        return result;
    }

    private int sideView(int [][] grid){
        int result = 0, currMax;

        for (int i = 0; i < grid[0].length ; i++) {
            currMax = 0;
            for (int[] ints : grid) {
                if (ints[i] > currMax) {
                    currMax = ints[i];
                }
            }
            result += currMax;
        }

        return result;
    }
}
