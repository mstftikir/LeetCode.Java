/*557. Reverse Words in a String III

Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Note: In the string, each word is separated by single space and there will not be any extra space in the string.
* */

package com.problems.problem557;

public class Problem557 {

    public static void main(String[] args) {
        var instance = new Problem557();

        String input = "Let's take LeetCode contest";

        String result = instance.reverseWords(input);

        System.out.println(result);
    }

    public String reverseWords(String s) {
        String [] splittedStr = s.split(" ");
        StringBuilder sb, result = new StringBuilder();

        for (String word : splittedStr){
            sb = new StringBuilder(word);
            result.append(sb.reverse());
            result.append(" ");
        }

        return result.toString().trim();
    }


}
