package HundredDaysOfCode;

import java.util.Arrays;

public class DayTenLeftRotate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        nums = rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    public static int[] rotate(int[] nums, int k) {
        int len = nums.length;
        k %= len;
        reverse(nums, 0, k - 1);
        reverse(nums, k, len - 1);
        reverse(nums, 0, len - 1);
        return nums;
    }

    public static void reverse(int nums[], int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}