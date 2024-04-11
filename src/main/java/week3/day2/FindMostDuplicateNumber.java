package week3.day2;

import java.util.*;

public class FindMostDuplicateNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String value = scan.nextLine();
        char maxOccurance = value.charAt(0);
        int maxValue = 1;

        char[] letter = value.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : letter) {
//            if (map.containsKey(c)) {
//                Integer count = map.get(c);
//                int newCount = count + 1;
//                map.put(c, newCount);
//            } else {
//                map.put(c, 1);
//            }
            map.put(c,map.getOrDefault(c,0)+1);
            Integer newValue = map.get(c);
            if(newValue > maxValue){
                maxOccurance = c;
                maxValue = newValue;
            }
        }
        System.out.println(maxOccurance);
    }
}
