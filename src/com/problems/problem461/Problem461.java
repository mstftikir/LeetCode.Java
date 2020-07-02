/*461. Hamming Distance

The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Note:
0 ≤ x, y < 231.

Example:

Input: x = 1, y = 4

Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑

The above arrows point to positions where the corresponding bits are different.
*/

package com.problems.problem461;

public class Problem461 {

    public static void main(String[] args) {
        Problem461 instance = new Problem461();

        int x = 1, y = 4;

        int result = instance.hammingDistance(x , y);

        System.out.println(result);
    }

    public int hammingDistance(int x, int y) {
        String xStr = Integer.toBinaryString(x);
        String yStr = Integer.toBinaryString(y);

        StringBuilder sbX = new StringBuilder(xStr);
        xStr = (sbX.reverse()).toString();
        StringBuilder sbY = new StringBuilder(yStr);
        yStr = (sbY.reverse()).toString();

        int hammingDistance = 0, biggest = Math.max(xStr.length(), yStr.length());

        for (int i = 0; i < biggest; i++) {
            if(xStr.length() > i && yStr.length() > i){
                if(xStr.charAt(i) != yStr.charAt(i)){
                    hammingDistance++;
                }
            }
            else if(xStr.length() > i){
                if(xStr.charAt(i) == '1'){
                    hammingDistance++;
                }
            }
            else{
                if(yStr.charAt(i) == '1'){
                    hammingDistance++;
                }
            }
        }

        return hammingDistance;
    }
}
