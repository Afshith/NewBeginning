package HundredDaysOfCode;

import java.util.Arrays;

public class Day_6_ReverseArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int i = 0,j = nums.length-1;
        while(i<j){
            swapReverse(nums,i,j);
            i++;
            j--;
        }
        System.out.println(Arrays.toString(nums));

    }
    public static void swapReverse(int nums[],int num1,int num2){
        int temp = nums[num1];
        nums[num1] = nums[num2];
        nums[num2] = temp;


    }
}
