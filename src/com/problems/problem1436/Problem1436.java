/*1436. Destination City

You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct path going from cityAi to cityBi. Return the destination city, that is, the city without any path outgoing to another city.

It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.



Example 1:

Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
Output: "Sao Paulo"
Explanation: Starting at "London" city you will reach "Sao Paulo" city which is the destination city. Your trip consist of: "London" -> "New York" -> "Lima" -> "Sao Paulo".
Example 2:

Input: paths = [["B","C"],["D","B"],["C","A"]]
Output: "A"
Explanation: All possible trips are:
"D" -> "B" -> "C" -> "A".
"B" -> "C" -> "A".
"C" -> "A".
"A".
Clearly the destination city is "A".
Example 3:

Input: paths = [["A","Z"]]
Output: "Z"


Constraints:

1 <= paths.length <= 100
paths[i].length == 2
1 <= cityAi.length, cityBi.length <= 10
cityAi != cityBi
All strings consist of lowercase and uppercase English letters and the space character.*/

package com.problems.problem1436;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Problem1436 {

    public static void main(String[] args) {
        Problem1436 instance = new Problem1436();

        List<List<String>> input = new LinkedList<>();
        List<String> cityList1 = new LinkedList<>();
        cityList1.add("London");
        cityList1.add("New York");
        input.add(cityList1);

        List<String> cityList2 = new LinkedList<>();
        cityList2.add("New York");
        cityList2.add("Lima");
        input.add(cityList2);

        List<String> cityList3 = new LinkedList<>();
        cityList3.add("Lima");
        cityList3.add("Sao Paulo");
        input.add(cityList3);

        String result = instance.destCity(input);

        System.out.println(result);

    }

    public String destCity(List<List<String>> paths) {
        Map<String, Integer> map = new HashMap<>();

        for (List<String> list :
                paths) {

            if(map.containsKey(list.get(0))){
                map.remove(list.get(0));
            }
            else{
                map.put(list.get(0), map.getOrDefault(list.get(0), 0) + 1);
            }

            if(map.containsKey(list.get(1))){
                map.remove(list.get(1));
            }
            else{
                map.put(list.get(1), map.getOrDefault(list.get(1), 0) + 1);
            }
        }


        for (List<String> list :
                paths) {

            if(map.containsKey(list.get(1))){
                return list.get(1);
            }
        }

        return paths.get(0).get(1);
    }
}
