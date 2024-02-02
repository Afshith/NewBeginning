package HundredDaysOfCode;

public class Day_22_Anagram {
    public static void main(String[] args) {
        String strOne = "abcd";
        String strTwo = "dcba";
        boolean answer = true;
        int[] frequency = new int[26];
        for (int i = 0; i < strOne.length(); i++) {
            frequency[strOne.charAt(i) - 'a']++;
            frequency[strTwo.charAt(i) - 'a']--;

        }
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != 0) {
                answer = false;
                break;
            }

        }
        if (answer) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }

    }
}
