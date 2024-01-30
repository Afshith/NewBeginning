package HundredDaysOfCode;

public class Day_12_ReverseNumber {
    public static void main(String[] args) {
        int number = 98908,number2 = 0;
        System.out.println(Integer.parseInt(new StringBuilder(String.valueOf(number)).reverse().toString()));

        while(number > 0){
            number2 = ( number2 * 10 ) + (number %10 );
            number/=10;

        }
        System.out.println(number2);


    }
}
