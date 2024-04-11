package week3.day2;

import java.util.*;

public class LearnSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        set.add("Six");
        set.add("Seven");

        System.out.println(set.size());
        System.out.println(set.contains("Two"));
        set.remove("Two");
        System.out.println(set.contains("Two"));

        System.out.println(set);


        Set<String> set2 = new LinkedHashSet<>();
        set2.add("One");
        set2.add("Two");
        set2.add("Three");
        set2.add("Four");
        set2.add("Five");
        set2.add("Six");
        set2.add("Seven");

        System.out.println(set2.size());
        System.out.println(set2.contains("Two"));
        set2.remove("Two");
        System.out.println(set2.contains("Two"));

        System.out.println(set2);

        Set<String> set3 = new TreeSet<>();
        set3.add("One");
        set3.add("Two");
        set3.add("Three");
        set3.add("Four");
        set3.add("Five");
        set3.add("Six");
        set3.add("Seven");

        System.out.println(set3.size());
        System.out.println(set3.contains("Two"));
        set3.remove("Two");
        System.out.println(set3.contains("Two"));

        System.out.println(set3);
    }
}
