package com.problems.problem1295;

public class Problem1295 {

	public static void main(String[] args) {
		var instance = new Problem1295();
		
		int[] input = {12,345,2,6,7896};
		
		var result = instance.findNumbers(input);
		
		System.out.println(result);
	}

    public int findNumbers(int[] nums) {
        int innerCounter = 0, outerCounter = 0;
    	for (int num : nums) {
    		innerCounter = 0;
    		while(num > 0) {
    			num /= 10;
    			innerCounter++;
    		}
    		
    		if(innerCounter % 2 == 0) {
    			outerCounter++;
    		}
		}
    	
    	return outerCounter;
    }
}
