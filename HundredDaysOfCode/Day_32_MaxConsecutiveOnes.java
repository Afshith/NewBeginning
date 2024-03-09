package HundredDaysOfCode;

public class Day_32_MaxConsecutiveOnes {
    public static void main(String args[]) {
        //
        int nums[] = { 1, 1, 0, 1, 1, 1 };
        int ans = findResult(nums);
        System.out.println("The maximum  consecutive 1's are " + ans);
    }
    static int findResult(int[] nums){
        int count = 0,max = 0;
        for(int num :nums){
            if(num == 1){
                count++;
            }
            else {
                count = 0;
            }
            max = Math.max(count ,max);
        }
        return max;
    }
}
