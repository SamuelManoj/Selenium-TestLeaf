package week1.day2;

import java.util.HashMap;
import java.util.Map;

public class CharOccurance {

    public static void main(String[] args) {
        // Check number of occurrences of a char (eg 'e') in a String

        String str = "welcome to chennai";
        char[] value = str.toCharArray();
        char maxchar = str.charAt(0);
        int maxvalue = 1;

        Map<Character, Integer> map = new HashMap<>();
        for (char c : value) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            if (maxvalue < map.get(c)) {
                maxchar = c;
                maxvalue = map.get(c);
            }
        }
        System.out.println(maxchar);

        // declare and initialize a variable count to store the number of occurrences

        // convert the string into char array

        //get the length of the array

        // traverse from 0 till the array length

        // Check the char array has the particular char in it

        // if is has increment the count


        // print the count out of the loop

    }

}