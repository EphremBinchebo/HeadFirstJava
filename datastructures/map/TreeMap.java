package datastructures.map;

import java.util.HashMap;

public class TreeMap {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<String, Integer>();
        scores.put("Kathy", 42);
        scores.put("Bert", 342);
        scores.put("Skyler", 420);
        System.out.println(scores);
        System.out.println(scores.get("Bert"));
        System.out.println(scores.containsValue(420));
        System.out.println(scores.containsKey("Skyler"));

    }
}
