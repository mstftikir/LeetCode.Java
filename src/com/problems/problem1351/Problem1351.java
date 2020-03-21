package com.problems.problem1351;

public class Problem1351 {

	public static void main(String[] args) {
		var instance = new Problem1351();
		
		int [][] input = 
			   {{4,3,2,-1},
				{3,2,1,-1},
				{1,1,-1,-2},
				{-1,-1,-2,-3}};
				
		int result = instance.countNegatives(input);
		
		System.out.println(result);
	}
	
    public int countNegatives(int[][] grid) {
    	int counter = 0;
    	
        for (int i = 0; i < grid.length; i++) {
    		for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] < 0) {
                    int remainig = grid[i].length - j;
                    counter += remainig;
                    break;
                }
			}
		}
    	
    	return counter;
    }

}
