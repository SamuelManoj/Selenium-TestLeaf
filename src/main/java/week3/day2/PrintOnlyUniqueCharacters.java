package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintOnlyUniqueCharacters {
    public static void main(String[] args) {
        String str = "Samuel Manoj";
        char[] ch = str.toCharArray();
        System.out.println(ch);
        Set<Character> set = new LinkedHashSet<>();
        for (char c : ch) {
            if (set.contains(c)) {
                set.remove(c);
            } else {
                set.add(c);
            }
        }
        System.out.println(set);

        List<Character> lis = new ArrayList<>(set);
        for (int i = 0; i < lis.size(); i++) {
            System.out.print(lis.get(i));
        }
    }
}
