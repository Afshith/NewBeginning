package HundredDaysOfCode;

public class DayElevenSecondLargest {
    public static void main(String[] args) {
        int[] nums = {1,25,6,78,90};
        int largest = nums[0];
        int second = nums[1];

        for(int num : nums){
            if(num > largest) {
                second = largest;
                largest = num;
            }
            else if((num > second) &&  (num != largest)){
                second = num;


            }
        }
        System.out.println(second);
    }


}
