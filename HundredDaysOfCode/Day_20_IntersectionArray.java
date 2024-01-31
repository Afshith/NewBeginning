package HundredDaysOfCode;

import java.util.Arrays;
import java.util.HashSet;

public class Day_20_IntersectionArray {
    public static void main(String[] args) {
        int[]arr1 = {1,2,3,3,4,5};
        int[]arr2 = {2,3,3,3};
        int i = 0, j=0;
        while(i < arr1.length && j <arr2.length){
            if(arr1[i] > arr2[j]){
                j++;
            }
            else if(arr1[i] < arr2[j]){
                i++;
            }
            else{
                System.out.println(arr1[i]);
                i++;
                j++;
            }

        }
        Integer[] array1 = {1,2,3,3,4,5};
        Integer[]array2 = {2,3,3,3};
        HashSet<Integer>s1 = new HashSet<>(Arrays.asList(array1));
        HashSet<Integer>s2 = new HashSet<>(Arrays.asList(array2));
        s1.retainAll(s2);
        Integer[] result = s1.toArray(new Integer[s1.size()]);
        System.out.println(Arrays.toString(result));

    }
    }