package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 7, 8, 6, 8, 9, 1, 10, 2, 3, 6, 7, 6, 8};
        Set<Integer> set = new TreeSet<>();
        for (int j : arr) {
            set.add(j);
        }
        System.out.println(set);
        List<Integer> lis = new ArrayList<>(set);
        System.out.println(lis);

        int x = lis.get(0);
        for (int i = 0; i < lis.size(); i++) {
            if (x + i != lis.get(i)) {
                int sum = x + i;
                System.out.println("Missing number " + sum);
                break;
            }
        }
    }
}
