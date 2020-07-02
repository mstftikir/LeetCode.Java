/*1370. Increasing Decreasing String

Given a string s. You should re-order the string using the following algorithm:

Pick the smallest character from s and append it to the result.
Pick the smallest character from s which is greater than the last appended character to the result and append it.
Repeat step 2 until you cannot pick more characters.
Pick the largest character from s and append it to the result.
Pick the largest character from s which is smaller than the last appended character to the result and append it.
Repeat step 5 until you cannot pick more characters.
Repeat the steps from 1 to 6 until you pick all characters from s.
In each step, If the smallest or the largest character appears more than once you can choose any occurrence and append it to the result.

Return the result string after sorting s with this algorithm.

 

Example 1:

Input: s = "aaaabbbbcccc"
Output: "abccbaabccba"
Explanation: After steps 1, 2 and 3 of the first iteration, result = "abc"
After steps 4, 5 and 6 of the first iteration, result = "abccba"
First iteration is done. Now s = "aabbcc" and we go back to step 1
After steps 1, 2 and 3 of the second iteration, result = "abccbaabc"
After steps 4, 5 and 6 of the second iteration, result = "abccbaabccba"
Example 2:

Input: s = "rat"
Output: "art"
Explanation: The word "rat" becomes "art" after re-ordering it with the mentioned algorithm.
Example 3:

Input: s = "leetcode"
Output: "cdelotee"
Example 4:

Input: s = "ggggggg"
Output: "ggggggg"
Example 5:

Input: s = "spo"
Output: "ops"
 

Constraints:

1 <= s.length <= 500
s contains only lower-case English letters.
 * */

package com.problems.problem1370;

import java.util.*;

public class Problem1370 {

	public static void main(String[] args) {
		Problem1370 instance = new Problem1370();

		String input = "aaaabbbbcccc";

		String result = instance.sortString(input);

		System.out.println(result);

	}

	public String sortString(String s) {
		Map<Character, Integer> tree = new TreeMap<>();
		Character c;
		
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if(!tree.containsKey(c)) {
				tree.put(c, 1);
			}
			else {
				tree.put(c, tree.get(c) + 1);
			}
			
		}

		StringBuilder result = new StringBuilder();
		boolean isDone = true;
		boolean increment = true;
		Integer currVal;
		
		TreeMap<Character, Integer> Rtree =
				new TreeMap<>(Collections.reverseOrder());

		for (Map.Entry<Character, Integer>  t : tree.entrySet()) {
			Rtree.put(t.getKey(), t.getValue());
		}
		
	    while(isDone) {
			if(increment) {
				for (Map.Entry<Character, Integer>  t : tree.entrySet()) {
					currVal = t.getValue();
					if(currVal > 0) {
						result.append(t.getKey());
						tree.put(t.getKey(), currVal - 1);
						Rtree.put(t.getKey(), currVal - 1);
					}
				}
				
				increment = false;
			}
			else {
				for (Map.Entry<Character, Integer> t : Rtree.entrySet()) {
					currVal = t.getValue();
					if(currVal > 0) {
						result.append(t.getKey());
						tree.put(t.getKey(), currVal - 1);
						Rtree.put(t.getKey(), currVal - 1);
					}
				}

				increment = true;
			}
			
			isDone = false;
			for (Map.Entry<Character, Integer> t : tree.entrySet()) {
				if(t.getValue() > 0) {
					isDone = true;
					break;
				}
			}
			
		}
		
		return  result.toString();
	}
}
