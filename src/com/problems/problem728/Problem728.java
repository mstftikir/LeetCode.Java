/*728. Self Dividing Numbers

A self-dividing number is a number that is divisible by every digit it contains.

For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.

Also, a self-dividing number is not allowed to contain the digit zero.

Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.

Example 1:
Input:
left = 1, right = 22
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
Note:

The boundaries of each input argument are 1 <= left <= right <= 10000.
* */

package com.problems.problem728;

import java.util.LinkedList;
import java.util.List;

public class Problem728 {
    public static void main(String[] args) {
        var instance = new Problem728();

        int left = 1, right = 22;

        List<Integer> result = instance.selfDividingNumbers(left, right);

        for (int i : result) {
            System.out.println(i);
        }
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> l = new LinkedList<>();

        int temp;
        boolean isSelfDivided = true;
        for (int i = left; i <= right; i++) {
            temp = i;
            while (temp > 1) {
                if (temp % 10 != 0 && i % (temp % 10) == 0) {
                    isSelfDivided = true;
                } else {
                    isSelfDivided = false;
                    break;
                }
                temp /= 10;
            }
            if (isSelfDivided) {
                l.add(i);
            }
        }

        return l;
    }
}