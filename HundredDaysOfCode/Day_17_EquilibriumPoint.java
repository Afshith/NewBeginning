package HundredDaysOfCode;

public class Day_17_EquilibriumPoint {
    public static void main(String[] args) {
        int[] nums = { 2,3,5,4,1};
        int rightSum = 0;
        int leftSum = 0;
        int answer = -1;
        for(int num : nums){
            rightSum += num;
        }
        for(int num : nums){
            rightSum-=num;
            if(leftSum == rightSum){
                answer = num;
                break;
            }
                leftSum+=num;
        }
        System.out.println(answer);
    }
}
