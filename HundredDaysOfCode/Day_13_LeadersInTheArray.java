package HundredDaysOfCode;

public class Day_13_LeadersInTheArray {
    public static void main(String[] args) {
        int[] nums = {16,17,4,3,5,2};
        int n = nums.length;
        int max = nums[n-1];
        System.out.println(max );

        for(int i = n-2;i>=0;i--){
            if(nums[i]>max){
                max = nums[i];
                System.out.println(max);
            }
        }
    }
}
