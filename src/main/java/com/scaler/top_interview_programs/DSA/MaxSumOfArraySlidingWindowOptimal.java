package com.scaler.top_interview_programs.DSA;

public class MaxSumOfArraySlidingWindowOptimal {
    public static void main(String[] args) {
        int [] arr = {2,1,5,1,3,2};
        int k = 3;
        int ans = maxSumOfArrayOfSizeK(arr , k);

        System.out.println(ans);
    }

    private static int maxSumOfArrayOfSizeK(int[] arr, int k) {
        int windowSum = 0;
        for(int i = 0 ; i < k; i++){
            windowSum += arr[i];
        }
        int maxSum = windowSum;

        for(int i = k ; i < arr.length ; i++){
            windowSum += arr[i];
            windowSum -= arr[i-k];
            maxSum = Math.max(maxSum , windowSum);
        }

        return maxSum;
    }


}
