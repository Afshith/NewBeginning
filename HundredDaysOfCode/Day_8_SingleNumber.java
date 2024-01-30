package HundredDaysOfCode;

public class Day_8_SingleNumber {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,4,5,5,6,7,8,8,7,6};
        int xor = 0;
        for(int num:nums){
            xor ^= num;
        }
        System.out.println(xor);
    }
}
