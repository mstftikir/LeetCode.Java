/*804. Unique Morse Code Words

International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.

For convenience, the full table for the 26 letters of the English alphabet is given below:

[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. For example, "cba" can be written as "-.-..--...", (which is the concatenation "-.-." + "-..." + ".-"). We'll call such a concatenation, the transformation of a word.

Return the number of different transformations among all words we have.

Example:
Input: words = ["gin", "zen", "gig", "msg"]
Output: 2
Explanation: 
The transformation of each word is:
"gin" -> "--...-."
"zen" -> "--...-."
"gig" -> "--...--."
"msg" -> "--...--."

There are 2 different transformations, "--...-." and "--...--.".
Note:

The length of words will be at most 100.
Each words[i] will have length in range [1, 12].
words[i] will only consist of lowercase letters.
*/

package com.problems.problem804;

import java.util.HashSet;
import java.util.Set;

public class Problem804 {

	public static void main(String[] args) {
		Problem804 instance = new Problem804();
		
		String [] input = {"gin", "zen", "gig", "msg"};
		
		int result = instance.uniqueMorseRepresentations(input);
		
		System.out.println(result);
	}

    public int uniqueMorseRepresentations(String[] words) {
    	String [] alphabet = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
    	StringBuilder sb;
    	
    	Set<String> set = new HashSet<>();
    	
    	for (String word : words) {
    		sb = new StringBuilder();
    		
    		for (Character c : word.toCharArray()) {
    			sb.append(alphabet[c - 'a']);
			}
    		
    		set.add(sb.toString());
		}
    	
    	return set.size();
    }
}
