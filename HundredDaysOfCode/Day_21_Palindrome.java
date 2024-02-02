package HundredDaysOfCode;

public class Day_21_Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        StringBuilder strResult = new StringBuilder(str);
        strResult.reverse();
        String rev = strResult.toString();

        if(str.equals(rev)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not Palindrome");
        }
    }
}
