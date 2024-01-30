package HundredDaysOfCode;

public class Day_4_LeapYearOrNot {
    public static void main(String[] args) {
        int year = 2019;
        if (isLeap(year)) {
            System.out.println("Leap");
        } else {
            System.out.println("Not Leap");
        }

    }

    public static boolean isLeap(int year) {
        boolean isLeapYear = false;
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            isLeapYear = true;
        }
        return isLeapYear;
    }
}
