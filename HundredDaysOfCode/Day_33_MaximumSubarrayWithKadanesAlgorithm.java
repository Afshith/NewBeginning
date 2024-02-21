package HundredDaysOfCode;

public class Day_33_MaximumSubarrayWithKadanesAlgorithm {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int currentSum = 0, maxSum = Integer.MIN_VALUE;
        for(int i : nums){
            currentSum += i;
            maxSum = Math.max(currentSum, maxSum);

            if(currentSum < 0){
                currentSum = 0;
            }
        }
        System.out.println(maxSum);
    }
}
