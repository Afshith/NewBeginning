package HundredDaysOfCode;

public class Day_25_ZeroOrOnePattern {
    public static void main(String[] args) {
        int num = 5;
        int printVal = 0;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                printVal ^= 1;
                System.out.print(printVal + " ");
            }
            System.out.println();
        }
        // for(int i = 1;i<=num;i++){
        //            for(int j = 1;j<=i;j++){
        //                if((i+j)%2 ==0){
        //System.out.print( 1 + "");
    //}
        //else{
       // System.out.print(0 + "");

        //
        //            }}
        //            System.out.println();
        //        }

    }
}
