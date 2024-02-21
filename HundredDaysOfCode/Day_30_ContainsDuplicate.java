package HundredDaysOfCode;

import java.util.HashSet;

public class Day_30_ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        HashSet<Integer> a = new HashSet<Integer>();
        boolean flag = false;
        for (int n:
             nums) {
            if(!a.add(n)){
                flag = true;
                break;
            }
        }
        System.out.println(flag ? "Duplicate" : "None");
    }

}
