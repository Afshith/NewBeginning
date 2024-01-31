package HundredDaysOfCode;

import java.util.Arrays;

public class Day_18_WaveArray {
    public static void main(String[] args) {
           int nums[] = {2,3,5,7,9,11};

           int i = 0,j=1;
           while(i<nums.length && j<nums.length){
               int temp = nums[i];
               nums[i] = nums[j];
               nums[j] = temp;
               i+=2;
               j+=2;
           }
        System.out.println(Arrays.toString(nums));
    }
}
