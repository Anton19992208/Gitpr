package com.lesson.collection;

import java.util.WeakHashMap;

public class CollectionDemo3 {

    public static void main(String[] args) {
        WeakHashMap<String, Integer> map = new WeakHashMap<>(9);

        map.put("Kot", 2);

        System.out.println(map);

    }
}
