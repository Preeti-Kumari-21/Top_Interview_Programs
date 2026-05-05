package com.scaler.top_interview_programs.DSA;

import java.util.HashSet;
import java.util.Set;

public class longestConsecutiveSeqOptimal {
    public static void main(String[] args) {
        int [] nums = {9,1,4,7,3,-1,0,5,8,-1,6};
        int ans = findLongestConsecutiveSequence(nums);
        System.out.println(ans);
    }

    private static int findLongestConsecutiveSequence(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }
        int maxLength = 0;

        for(int num : set){
            if(!set.contains(num-1)){
                int current = num;
                int length = 1;
                while(set.contains(current+1)){
                    current++;
                    length++;
                }
                maxLength = Math.max(maxLength,length);
            }
        }
        return maxLength;
    }
}
