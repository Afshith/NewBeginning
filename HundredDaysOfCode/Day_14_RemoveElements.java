package HundredDaysOfCode;

import java.util.*;

public class Day_14_RemoveElements {
    public static void main(String[] args) {
        int[] nums = {1,2,2,7,7,3,4,4,5};
        int j = 0;
        for(int i =1;i<nums.length;i++){
            if(nums[j]!=nums[i]){
                j++;
                nums[j] = nums[i];
            }
        }
        System.out.println(j+1);
    }
}

// {10,11,12,13,0,0,0,0,0} {1,2,3,4,5}
