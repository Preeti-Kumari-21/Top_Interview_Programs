package com.scaler.top_interview_programs.DSA;

import java.util.HashSet;
import java.util.Set;

public class CheckDuplicates {
    public static void main(String[] args) {
        int [] arr = {1,1,2,3,4,1,2,3};
        boolean ans = checkDuplicates(arr);
        System.out.println(ans);
    }

    private static boolean checkDuplicates(int[] arr) {
        boolean ans = false;
        Set<Integer> set = new HashSet<>();
        for(int num : arr){
            if(set.contains(num)){
                ans = true;
            }
            set.add(num);
        }
        return ans;
    }
}
