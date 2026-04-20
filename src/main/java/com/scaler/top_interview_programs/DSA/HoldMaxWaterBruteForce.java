package com.scaler.top_interview_programs.DSA;

public class HoldMaxWaterBruteForce {
    public static void main(String[] args) {
        int [] arr = {1,8,6,2,5,4,8,3,7};
        int ans = HoldMaxWaterByContainer(arr);
        System.out.println(ans);
    }

    private static int HoldMaxWaterByContainer(int[] arr) {
        int maxArea = 0;

        for(int i=0 ; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                int height = Math.min(arr[i] , arr[j]);
                int width = j-i;
                int area = height * width;
                maxArea = Math.max(maxArea , area);
            }
        }

        return maxArea;
    }
}
