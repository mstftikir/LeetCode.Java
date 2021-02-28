package com.problems.trials;

import java.util.*;

public class Trials {

    public static void main(String[] args) {
        //String
        String string = "test";
        System.out.println("String length: " + string.length());

        //LinkedList
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(4);
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(2);
        System.out.println("LinkedList length: " + linkedList.size());

        //Array
        int[] intArray = {4, 2, 1, 3};
        System.out.println("Array length: " + intArray.length);

        StringBuilder sb = new StringBuilder();
        for (int i : intArray) {
            sb.append("Array value: ").append(i).append(System.lineSeparator());
        }
        System.out.println(sb.toString());

        //Set
        Set<Integer> set = new LinkedHashSet<>();
        set.add(4);
        set.add(2);
        set.add(1);
        set.add(3);

        System.out.println("Set length: " + set.size());

        sb = new StringBuilder();
        for (int s : set) {
            sb.append("Set item: ").append(s).append(System.lineSeparator());
        }
        System.out.println(sb);

        //Map
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 2);
        map.put(4, 1);
        map.put(5, 3);

        sb = new StringBuilder();
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            sb.append("Map key: ").append(m.getKey()).append(", ").append("value :").append(m.getValue()).append(System.lineSeparator());
        }
        System.out.println(sb);

        //Stack
        Deque<Integer> stack = new LinkedList<>();
        for (int i : set) {
            stack.push(i);
        }

        sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append("Stack value: ").append(stack.pop()).append(System.lineSeparator());
        }
        System.out.println(sb);

        //Queue
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(2);
        queue.offer(1);
        queue.offer(4);
        queue.offer(3);

        while (!queue.isEmpty()){
            sb.append("Queue item: ").append(queue.poll()).append(System.lineSeparator());
        }
        System.out.println(sb);

        //Iterator [Map]
        Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
        sb = new StringBuilder();
        while (it.hasNext()){
            Map.Entry<Integer, Integer> e = it.next();
            sb.append("[Iterator] Map key: ").append(e.getKey()).append(", ").append(e.getValue()).append(System.lineSeparator());
        }
        System.out.println(sb);

        //Iterator [List]
        Iterator<Integer> itr = linkedList.iterator();

        sb = new StringBuilder();
        while(itr.hasNext()){
            Integer i = itr.next();
            sb.append("[Iterator] List value: ").append(i).append(System.lineSeparator());
        }
        System.out.println(sb);


        //Iterator [Set]
        Iterator<Integer> itrs = set.iterator();
        sb = new StringBuilder();
        while(itrs.hasNext()){
            Integer is = itrs.next();
            sb.append("[Iterator] Set value: ").append(is).append(System.lineSeparator());
        }
        System.out.println(sb);
    }
}
