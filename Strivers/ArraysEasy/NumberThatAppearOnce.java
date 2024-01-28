package Strivers.ArraysEasy;

public class NumberThatAppearOnce {
    public static void main(String args[]) {
        int[] arr = {4, 1, 2, 1, 2,8,8,9,9,0,0};
        int ans = getSingleElement(arr);
        System.out.println("The single element is: " + ans);

    }
    static int getSingleElement(int[] nums){
        int result = 0;
        for(int num : nums){
            result ^=num;
        }
        return result;
    }
}
