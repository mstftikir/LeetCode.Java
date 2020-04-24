/*1002. Find Common Characters

Given an array A of strings made only from lowercase letters, return a list of all characters that show up in all strings within the list (including duplicates).  For example, if a character occurs 3 times in all strings but not 4 times, you need to include that character three times in the final answer.

You may return the answer in any order.



Example 1:

Input: ["bella","label","roller"]
Output: ["e","l","l"]
Example 2:

Input: ["cool","lock","cook"]
Output: ["c","o"]


Note:

1 <= A.length <= 100
1 <= A[i].length <= 100
A[i][j] is a lowercase letter
* */

package com.problems.problem1002;

import java.util.*;

public class Problem1002 {
    public static void main(String[] args) {
        Problem1002 instance = new Problem1002();

        String[] input = {"bella", "label", "roller"};

        List<String> result = instance.commonChars(input);

        for (String i :
                result) {
            System.out.println(i);

        }
    }

    public List<String> commonChars(String[] A) {
        List<Map<Character, Integer>> lMap = new ArrayList<>(A.length);
        Map<Character, Integer> map;
        List<String> l = new LinkedList<>();

        for (String s : A) {
            map = new HashMap<>();
            for (char c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            lMap.add(map);
        }

        int existingCounter;
        char c = Character.MIN_VALUE;
        for (int i = 0; i < A[0].length(); i++) {
            existingCounter = 0;
            for (Map<Character, Integer> m : lMap) {
                c = A[0].charAt(i);
                if(m.containsKey(c) && m.get(c) > 0){
                    existingCounter++;
                    m.put(c, m.get(c) - 1);
                }
            }
            if(existingCounter == A.length){
                l.add(String.valueOf(c));
            }
        }

        return l;
    }
}
