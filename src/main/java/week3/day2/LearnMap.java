package week3.day2;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args) {
        Map<String, Integer> hash = new HashMap<>();
        hash.put("Sam", 10);
        hash.put("Manoj", 20);
        hash.put("Samuel", 30);
        hash.put("Sam", 50);

        System.out.println(hash);
        System.out.println(hash.size());

        for (Map.Entry<String, Integer> entry : hash.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println(entry);
        }

    }
}
