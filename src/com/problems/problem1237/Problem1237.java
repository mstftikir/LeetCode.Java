package com.problems.problem1237;

import java.util.*;

public class Problem1237 {
    public static void main(String[] args) {
        Problem1237 instance = new Problem1237();

        CustomFunction customFunction = new CustomFunction();
        int input = 5;

        List<List<Integer>> result = instance.findSolution(customFunction, input);

        for (List<Integer> i : result) {
            System.out.println(i);
        }
    }

    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> currList;

        int curr;

        for (int i = 1; i <= 1000; i++) {
            for (int j = 1; j <= 1000; j++) {
                curr = customfunction.f(i, j);

                if (curr == z) {
                    currList = new LinkedList<>();
                    currList.add(i);
                    currList.add(j);
                    result.add(currList);
                }
            }

        }

        return result;
    }
}
