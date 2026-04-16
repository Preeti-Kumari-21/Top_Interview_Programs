package com.scaler.top_interview_programs.DSA;

//Check the subarray which will have maximum sum in the given array
public class KadanesBruteForceApproach {
    public static void main(String[] args) {
        //int [] arr = {2,1,2,-1,4}; //8
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4}; //6
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i ; j<n; j++){
                int sum = 0;
                for(int k=i; k<=j; k++){
                    sum+=arr[k];
                }
                maxSum = Math.max(sum,maxSum);
            }
        }
        System.out.println(maxSum);
    }

}
