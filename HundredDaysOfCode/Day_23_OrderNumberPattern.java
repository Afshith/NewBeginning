package HundredDaysOfCode;

public class Day_23_OrderNumberPattern {
    public static void main(String[] args) {
        int num = 10;
        for(int i = 1;i<=num;i++){
            for (int j = 1;j<=i;j++){
                System.out.print( j + " ");
            }
            System.out.println();
        }
    }
}
