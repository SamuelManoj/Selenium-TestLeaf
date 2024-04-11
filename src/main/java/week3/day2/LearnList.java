package week3.day2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LearnList {
    public static void main(String[] args) {
        List<String> lis = new ArrayList<>();
        lis.add("One");
        lis.add("Two");
        lis.add("Three");
        lis.add("Four");
        lis.add("Five");
        lis.add("Six");
        lis.add(1,"Seven");

        System.out.println(lis.size());
        System.out.println(lis.get(1));
        System.out.println(lis.contains("Two"));
        lis.remove("Two");
        System.out.println(lis.contains("Two"));

        System.out.println(lis);
        Collections.sort(lis);
        System.out.println(lis);
    }
}
