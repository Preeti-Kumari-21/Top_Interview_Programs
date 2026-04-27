package com.scaler.top_interview_programs.DSA;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounting {
    public static void main(String[] args) {
        int [] arr = {1,1,2,3,2,4,3,2};
        Map<Integer,Integer> map =  countFrequencyOfEachElement(arr);

        System.out.println(map);
    }

    private static Map<Integer, Integer> countFrequencyOfEachElement(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num , map.getOrDefault(num , 0) + 1);
        }
        return map;
    }
}
