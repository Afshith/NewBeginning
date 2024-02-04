package Strivers.ArraysEasy;

public class GetLongestSubArrayWithSumK {
    public static void main(String[] args) {
        int[] nums = {2,3,5,1,1,1,1,1,1,1,1,1,1};
        int left = 0,right = 0,k=10,sum = nums[0],maxLen = 0;
        int len = nums.length;
        while(right<len){

            while(left<=right && sum > k){
                sum-=nums[left++];

            }
            if(sum == k){
                maxLen = Math.max(maxLen , right - left + 1);
            }

            right++;
            if(right<len){
                sum+=nums[right];
            }

        }
        System.out.println(maxLen);
    }
}
