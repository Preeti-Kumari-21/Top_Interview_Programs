package com.scaler.top_interview_programs.DSA;

public class longestConsecutiveSeqBruteForce {
    public static void main(String[] args) {
        //int [] nums = {100,4,200,1,3,2};
        int [] nums = {9,1,4,7,3,-1,0,5,8,-1,6};
        int ans = findLongestSequence(nums);
        System.out.println(ans);
    }

    private static int findLongestSequence(int[] nums) {
        int maxLength = 0;
        for(int i=0 ; i<nums.length; i++){
            int current = nums[i];
            int length = 1;

            while(contains(nums , current + 1)){
                current ++;
                length++;
            }
            maxLength = Math.max(maxLength,length);
        }
        return maxLength;
    }

    public static boolean contains(int nums[] , int target){
        for(int i=0 ; i<nums.length; i++){
            if(nums[i] == target){
                return true;
            }
        }
        return false;
    }
}
