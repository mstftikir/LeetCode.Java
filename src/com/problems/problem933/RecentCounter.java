package com.problems.problem933;

import java.util.*;

public class RecentCounter {
    final List <Integer> list;
    int counter;
    public RecentCounter() {
        list  = new LinkedList<>();
        counter = 0;
    }

    public int ping(int t) {
        list.add(0, t);
        counter = 0;

        for(int c : list){
            int calculatedValue = c + 3000;
            if(t <= calculatedValue){
                counter++;
            }
            else{
                break;
            }
        }

        return counter;
    }
}
