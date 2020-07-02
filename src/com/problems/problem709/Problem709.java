/*709. To Lower Case

Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.

 

Example 1:

Input: "Hello"
Output: "hello"
Example 2:

Input: "here"
Output: "here"
Example 3:

Input: "LOVELY"
Output: "lovely"
 * */

package com.problems.problem709;

public class Problem709 {

	public static void main(String[] args) {
		Problem709 instance = new Problem709();

		String input = "Hello";

		String result = instance.toLowerCase(input);
		
		System.out.println(result);
	}
	
    public String toLowerCase(String str) {
        //return str.toLowerCase();

        char[] s = str.toCharArray();
    	
    	for(int i = 0; i < s.length; i++) {
            if(s[i] >= 65 && s[i] <= 90){
            	char c = (char) (s[i] + 32);
            	s[i] = c;
            }
    	}
    	
    	return new String(s);
    }

}
