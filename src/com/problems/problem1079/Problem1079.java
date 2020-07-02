/*1079. Letter Tile Possibilities

You have a set of tiles, where each tile has one letter tiles[i] printed on it.  Return the number of possible non-empty sequences of letters you can make.



Example 1:

Input: "AAB"
Output: 8
Explanation: The possible sequences are "A", "B", "AA", "AB", "BA", "AAB", "ABA", "BAA".
Example 2:

Input: "AAABBC"
Output: 188


Note:

1 <= tiles.length <= 7
tiles consists of uppercase English letters.
Accepted
* */

package com.problems.problem1079;

import java.util.HashSet;
import java.util.Set;

public class Problem1079 {
    private Set<String> set;
    private char[] chars;

    public static void main(String[] args) {
        Problem1079 instance = new Problem1079();

        String input = "AAB";

        int result = instance.numTilePossibilities(input);

        System.out.println(result);
    }

    public int numTilePossibilities(String tiles) {
        int len = tiles.length();

        set = new HashSet<>();
        chars = tiles.toCharArray();

        for (int l = 1; l <= len; l++) {
            dfs(new boolean[len], l, new StringBuilder());
        }

        return set.size();
    }

    private void dfs(boolean[] visited, int l, StringBuilder cur) {
        if (l == 0) {
            set.add(cur.toString());
        }

        for (int i = 0; i < chars.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                cur.append(chars[i]);
                dfs(visited, l - 1, cur);
                cur.deleteCharAt(cur.length() - 1);
                visited[i] = false;
            }
        }
    }
}
