package HundredDaysOfCode;

import java.util.HashMap;
import java.util.HashSet;

public class Day_19_KeyPair {
    public static void main(String[] args) {
        int[] nums = {1,4,5,6,10,8};
        int target = 68;
        System.out.println(findKeyPair(nums,target));

    }
    public static boolean findKeyPair(int[] nums,int target){
        HashSet<Integer> resultIndexes = new HashSet<>();

        for(int num : nums){
            int val = target - num;
            if(resultIndexes.contains(val)){
                return true;
            }
            else {
                resultIndexes.add(num);
            }
        }
        return  false;
    }
}
