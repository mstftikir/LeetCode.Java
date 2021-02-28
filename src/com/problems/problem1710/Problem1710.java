package com.problems.problem1710;

import java.util.Collections;
import java.util.TreeMap;

public class Problem1710 {
    public static void main(String[] args) {
        System.out.println(maximumUnits(new int[][]{{5,10},{2,5},{4,7},{3,9}}, 10));
    }

    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        TreeMap<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());

        for(int[] boxType : boxTypes){
            map.put(boxType[1], map.getOrDefault(boxType[1], 0) + boxType[0]);
        }

        int result = 0;
        while(truckSize > 0){
            if(map.firstEntry().getValue() <= truckSize){
                result += map.firstKey() * map.firstEntry().getValue();
            }
            else{
                result += truckSize * map.firstKey();
            }
            truckSize -= map.firstEntry().getValue();
            map.remove(map.firstKey());

            if(map.isEmpty()) return result;
        }

        return result;
    }
}
