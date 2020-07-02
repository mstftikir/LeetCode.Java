package com.problems.problem1476;

public class SubrectangleQueries {
    private final int[][] matrix = new int [100][100];

    public SubrectangleQueries(int[][] rectangle) {
        for (int i = 0; i < rectangle.length; i++) {
            System.arraycopy(rectangle[i], 0, matrix[i], 0, rectangle[i].length);
        }
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                matrix[i][j] = newValue;
            }
        }
    }

    public int getValue(int row, int col) {
        return matrix[row][col];
    }
}
