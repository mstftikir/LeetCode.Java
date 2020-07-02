package com.problems.problem1450;

public class Problem1450 {
    public static void main(String[] args) {
        Problem1450 instance = new Problem1450();

        int[] startTime = {1, 2, 3}, endTime = {3, 2, 7};
        int queryTime = 4;

        int result = instance.busyStudent(startTime, endTime, queryTime);

        System.out.println(result);
    }

    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int result = 0;
        for (int i = 0; i < startTime.length; i++) {
            if(startTime[i] <= queryTime && endTime[i] >= queryTime){
                result++;
            }
        }
        return result;
    }
}
