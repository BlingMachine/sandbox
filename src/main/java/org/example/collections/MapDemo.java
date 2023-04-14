package org.example.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class MapDemo {
    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        hashMap.put(4, "Four");
        hashMap.put(5, "Five");

        System.out.println(hashMap);
        for(int x = 1; x <= 5; x++){
            System.out.println(hashMap.get(x));
        }
        Set<Integer> keySet = hashMap.keySet();
        System.out.println(keySet);
    }
}
