package com.problems.problem977;

import java.util.*;

public class Problem977 {

    public static void main(String[] args) {
        Problem977 instance =new Problem977();

        int [] input = {-4,-1,0,3,10};

        int [] result = instance.sortedSquares(input);

        for (int i : result) {
            System.out.println(i);
        }
    }

    public int[] sortedSquares(int[] A) {
        List<Integer> list = new LinkedList<>();

        for(int i : A){
            list.add(i * i);
        }

        Collections.sort(list);

        for (int i = 0; i < A.length ; i++) {
            A[i] = list.get(i);
        }

        return A;
    }
}
