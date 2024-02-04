package HundredDaysOfCode;

public class Day_27_RemoveElement {
    public static void main(String[] args) {
        int[] nums = {1,2,2,2,3,4,5};
        int count = 0;
        int value = 2;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=value){
                nums[count++] = nums[i];
            }

        }
        System.out.println(count);
    }
}
