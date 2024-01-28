package Strivers.ArraysEasy;

public class MissingNumber {
    public static void main(String args[]) {
        int N = 5;
        int a[] = {1, 2, 4, 5};

        int ans1 = missingNumberMethodOne(a, N);
        int ans2 = missingNumberMethodTwo(a,N);
        System.out.println("The missing number is: " + ans1);
        System.out.println("The missing number is: " + ans2);
    }
    static int missingNumberMethodOne(int[] nums , int size){
        int result = 0;
        for(int var : nums){
            result += var;
        }
        int sumNatural = (size * (size + 1)) /2;
        return sumNatural - result;

    }
    static int missingNumberMethodTwo(int[] nums,int N){
        int xor1 = 0, xor2 = 0;

        for (int i = 0; i < N - 1; i++) {
            xor2 = xor2 ^ nums[i];
            xor1 = xor1 ^ (i + 1);
        }
        xor1 = xor1 ^ N;

        return (xor1 ^ xor2);
    }
}
