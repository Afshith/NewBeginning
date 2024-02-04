package HundredDaysOfCode;

public class Day_28_RotateString {
    public static void main(String[] args) {
        String s1 = "abcde";
        String goal = "deabc";
        String answer = s1 + s1;
        int index = answer.indexOf(goal);
        if(index >= 0){
            System.out.println("true");

        }
        else{
            System.out.println("false");
        }
    }
}
