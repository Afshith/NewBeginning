package HundredDaysOfCode;

public class Day_29_MajorityElement {
    public static void main(String[] args) {
        int[] givenArray = {2,2,33,2,334,2,44,2,777,2,8,2,9};
        int count = 1, element = givenArray[0];
        for (int i = 1; i < givenArray.length; i++) {
            if(count == 0){
                element = givenArray[i];
                count = 1;
            }
            else if(element == givenArray[i]){
                count++;}

            else{
                count--;
            }
        }
        int cnt1= 0;
        for(int j = 0;j<givenArray.length;j++){
            if(element == givenArray[j]){
                cnt1++;
            }

        }
        if(cnt1 > givenArray.length/2){
            System.out.println(element);

        }
        else{
            System.out.println(-1);
        }

    }
}
