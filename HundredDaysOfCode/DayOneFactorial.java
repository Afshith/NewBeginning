package HundredDaysOfCode;

public class DayOneFactorial {
    public static void main(String[] args) {
        int result = 1, n = 8;
        for(int i = 2; i <= n; i++ ){
            result *= i;
        }
        System.out.println(result);
    }
}
