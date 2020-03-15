/*771. Jewels and Stones

You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:

Input: J = "aA", S = "aAAbbbb"
Output: 3
Example 2:

Input: J = "z", S = "ZZ"
Output: 0
Note:

S and J will consist of letters and have length at most 50.
The characters in J are distinct.
 * */

package com.problems.problem771;

import java.util.HashSet;

public class Problem771 {

	public static void main(String[] args) {
		
		var instance = new Problem771();
		
		String J = "aA", S = "aAAbbbb";
		
		var result = instance.numJewelsInStones(J, S);
		
		System.out.println(result);
	}
	//O(nlgn) solution
    public int numJewelsInStones(String J, String S) {
        int counter = 0;
    	
        HashSet<Character> hSet = new HashSet<Character>();
        
        for (int i = 0; i < J.length(); i++) {
			hSet.add(J.charAt(i));
		}
        
        for (int i = 0; i < S.length(); i++) {
			if(hSet.contains(S.charAt(i))) {
				counter++;
			}
		}
        
    	return counter;
    }
	
	/* O(n^2) solution
    public int numJewelsInStones(String J, String S) {
        int counter = 0;
    	
        for (int i = 0; i < J.length(); i++) {
			for (int k = 0; k < S.length(); k++) {
				if(J.charAt(i) == S.charAt(k)) {
					counter++;
				}
			}
		}
        
    	return counter;
    }
	*/

}
