package com.scaler.top_interview_programs.DSA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class checkTwoSum {
    public static void main(String[] args) {
        //int num[] = {2,7,11,15};
        //int target = 9;

        int num[] = {4,6,8,9,1};
        int target = 7;
        int[] ans = checkTwoSumOptSol(num,target);

        System.out.println(Arrays.toString(ans));
    }

    private static int[] checkTwoSumOptSol(int[] num, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            int complement = target - num[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(num[i],i);
        }
        return null;
    }
}
