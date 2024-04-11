package week3.day2;

import javax.swing.*;
import java.util.Map;
import java.util.TreeMap;

public class FindNumberOccurances {

    public static void main(String[] args) {
        int[] value = {2, 3, 5, 6, 3, 2, 1, 4, 2, 1, 6, -1};
        Map<Integer, Integer> tree = new TreeMap<>();
        for (int a : value) {
            if (tree.containsKey(a)) {
                Integer count = tree.get(a);
                int newCount = count + 1;
                tree.put(a, newCount);
            } else {
                tree.put(a, 1);
            }
        }
        System.out.println(tree);
    }
}
