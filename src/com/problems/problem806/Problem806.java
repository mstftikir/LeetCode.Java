package com.problems.problem806;

import java.util.Arrays;

public class Problem806 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(numberOfLines(new int[]{4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, "bbbcccdddaaa")));
    }

    public static int[] numberOfLines(int[] widths, String s) {
        int lineCounter = 0;
        int numberOfLines = 1;
        for (char c : s.toCharArray()) {
            if (lineCounter + widths[c - 'a'] <= 100) {
                lineCounter += widths[c - 'a'];
            } else {
                numberOfLines++;
                lineCounter = widths[c - 'a'];
            }
        }
        return new int[]{numberOfLines, lineCounter};
    }
}
