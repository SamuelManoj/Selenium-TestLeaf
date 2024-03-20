package week1.day2.assignments.optional;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String text1 = "stops";
        String text2 = "potss";
        boolean value = true;
        char[] tx1 = text1.toCharArray();
        char[] tx2 = text2.toCharArray();
        Arrays.sort(tx1);
        Arrays.sort(tx2);
        if (tx1.length != tx2.length) {
            System.out.print("This is not an anagram");
        } else {
            for (int i = 0; i < tx1.length - 1; i++) {
                if (tx1[i] != tx2[i]) {
                    value = false;
                    break;
                }
            }
            if (value) {
                System.out.print("This is an anagram");
            } else {
                System.out.print("This is not an anagram");
            }
        }
    }
}
