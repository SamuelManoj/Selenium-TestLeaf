package week3.day2;

import week3.day1.Interface.SamsungTV;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindAllOccurances {
    public static void main(String[] args) {
        System.out.println("Type the value");
        Scanner scan = new Scanner(System.in);
        String value = scan.nextLine();

        char[] ar_value = value.toCharArray();
        Map<Character, Integer> hash = new HashMap<>();
        for (char ar : ar_value) {
            if (hash.containsKey(ar)) {
                Integer count = hash.get(ar);
                int newcount = count + 1;
                hash.put(ar, newcount);
            } else {
                hash.put(ar, 1);
            }
        }
        System.out.println(hash);
    }
}

