package com.scaler.top_interview_programs.DSA;

// You have an array of numbers
//Target value will also be given
//Find out which all indices values of array when added will give me target ie nums[i] + nums[j] == target
//This is bruteforce approce

import java.util.Arrays;

public class checkTwoSumBruteForce {
    public static void main(String[] args) {
        int nums [] = {2,7,11,15};
        int target = 9;
        int[] ans = checkTwoSum(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] checkTwoSum(int[] nums, int target){
        for(int i=0 ; i<nums.length ; i++){
            for(int j=i+1 ; j<nums.length ; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}

//Here the TC is O(n2) -- not acceptable
//Lets see the optimized approach