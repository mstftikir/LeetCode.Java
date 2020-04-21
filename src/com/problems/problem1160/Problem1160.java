/*1160. Find Words That Can Be Formed by Characters

You are given an array of strings words and a string chars.

A string is good if it can be formed by characters from chars (each character can only be used once).

Return the sum of lengths of all good strings in words.



Example 1:

Input: words = ["cat","bt","hat","tree"], chars = "atach"
Output: 6
Explanation:
The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
Example 2:

Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
Output: 10
Explanation:
The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.


Note:

1 <= words.length <= 1000
1 <= words[i].length, chars.length <= 100
All strings contain lowercase English letters only.
* */

package com.problems.problem1160;

import java.util.*;

public class Problem1160 {
    public static void main(String[] args) {
        var instance = new Problem1160();

        String[] words = {"cat","bt","hat","tree"};
        String chars = "atach";

        int result = instance.countCharacters(words, chars);

        System.out.println(result);
    }

    public int countCharacters(String[] words, String chars) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : chars.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> backUp = new HashMap<>(map);

        int result = 0;
        boolean isOk;
        for (String s : words) {
            map = new HashMap<>(backUp);

            isOk = true;
            for (Character c : s.toCharArray()) {
                if (!map.containsKey(c) || map.get(c) == 0) {
                    isOk = false;
                    break;
                }
                else{
                    map.put(c, map.getOrDefault(c, 0) - 1);
                }
            }

            if (isOk){
                result += s.length();
            }

        }

        return result;
    }
}
