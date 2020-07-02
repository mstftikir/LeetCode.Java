package com.problems.problem961;

import java.util.HashMap;
import java.util.Map;

public class Problem961 {
    public static void main(String[] args) {
        Problem961 instance = new Problem961();

        int[] input = {1, 2, 3, 3};

        int result = instance.repeatedNTimes(input);

        System.out.println(result);
    }

    public int repeatedNTimes(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : A) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);

                if (map.get(i) == (A.length / 2)) {
                    return i;
                }
            }
        }

        return 0;
    }
}
