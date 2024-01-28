package HundredDaysOfCode;

import java.util.Arrays;

public class DayNineRightRotate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};

        int len = nums.length;
        int last = nums[len - 1];
        for (int i = len - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = last;
        System.out.println(Arrays.toString(nums));
    }
}
