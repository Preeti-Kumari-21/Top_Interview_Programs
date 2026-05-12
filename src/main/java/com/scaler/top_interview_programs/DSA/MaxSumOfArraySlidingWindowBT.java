package com.scaler.top_interview_programs.DSA;

public class MaxSumOfArraySlidingWindowBT {
    public static void main(String[] args) {
        int [] arr = {2,1,5,1,3,2};
        int k = 3;
        int ans = maxSumOfArrayOfSizeK(arr , k);

        System.out.println(ans);
    }

    private static int maxSumOfArrayOfSizeK(int[] arr, int k) {
        int maxSum = 0;
        for(int i = 0 ; i < arr.length-k ; i++){
            int sum = 0;
            for(int j = i ; j < i + k; j++){
                sum += arr[j];
            }
            maxSum = Math.max(maxSum , sum);
        }
        return maxSum;
    }


}
