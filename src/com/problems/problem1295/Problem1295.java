package com.problems.problem1295;

public class Problem1295 {

	public static void main(String[] args) {
		Problem1295 instance = new Problem1295();
		
		int[] input = {12,345,2,6,7896};

		int result = instance.findNumbers(input);
		
		System.out.println(result);
	}
	
	// Solution with O(n) time complexity
	public int findNumbers(int[] nums) {
		int counter = 0;
        int i;
        String s;
        
    	for (int num : nums) {
    		i = num;
    		s = Integer.toString(i);
    		if(s.length() % 2 == 0) {
    			counter++;
    		}
		}
    	
    	return counter;
    }
	
/* O(n^2) time compexity
 * public int findNumbers(int[] nums) {
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
 * */
    
}
