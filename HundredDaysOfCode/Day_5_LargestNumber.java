package HundredDaysOfCode;

public class Day_5_LargestNumber {
    public static void main(String[] args) {
        int[] nums = {1,25,6,78,90};
        int largest = nums[0];
        for(int i :nums){
            if(i>largest){
                largest = i;
            }
        }
        System.out.println(largest);
    }
}
