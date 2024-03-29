package HundredDaysOfCode;

import java.util.Arrays;

public class Day_16_MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = { 1,2,3,0,0,0,0,0};
        int[] nums2 = { 3,4,5,6,9};
        int m = 3;
        int n = 5;
        merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));

    }
    public  static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m -1 , j = n-1;
        while( i>=0 && j>=0){
            if(nums1[i] > nums2[j]){
                nums1[i+j+1] = nums1[i];
                i--;
            }
            else{
                nums1[i+j+1] = nums2[j];
                j--;
            }
        }

        while(j>=0){
            nums1[j] = nums2[j];
            j--;
        }

    }
}
