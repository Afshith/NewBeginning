package HundredDaysOfCode;

import java.util.ArrayList;
import java.util.HashMap;

public class Day_31_TwoSum {
    public static void main(String[] args) {
        int[] nums = {11,15,2,7};
        int value = 9;
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++){
            int complement = value - nums[i];
            if(hm.containsKey(complement)){
                result.add(hm.get(complement));
                result.add(nums[i]);
            } else{
                hm.put(nums[i], i);
            }
        }
        System.out.println(result);
    }
}
