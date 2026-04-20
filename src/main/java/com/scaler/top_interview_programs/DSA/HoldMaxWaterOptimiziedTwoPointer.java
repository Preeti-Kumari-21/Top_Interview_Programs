package com.scaler.top_interview_programs.DSA;

public class HoldMaxWaterOptimiziedTwoPointer {
    public static void main(String[] args) {
        int [] arr = {1,8,6,2,5,4,8,3,7};
        int ans = HoldMaxWaterByContainer(arr);
        System.out.println(ans);
    }

    public static int HoldMaxWaterByContainer(int [] height){
        int maxArea = 0;
        int left = 0;
        int right = height.length-1;

        while(left < right){
            int h = Math.min(height[left] , height[right]);
            int width = right - left;
            int area = h * width;
            maxArea = Math.max(maxArea , area);
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }

        return maxArea;
    }
}
