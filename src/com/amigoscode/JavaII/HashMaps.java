package com.amigoscode.JavaII;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        int a = 10;
        String b = "hello";
        int[] c = {1,2,3};

        //Hashmaps need object names.
        HashMap<String, Integer> happy = new HashMap<>();

        happy.put("a", 10);
        happy.put("b",3);
        happy.put("c", 88);

        System.out.println(happy.get("c"));

        HashMap<String, String> fun = new HashMap<>();

        fun.put("nullMan", "stardew");
        fun.put("anotherUser", "billman123");
        fun.put("intoTheWild1", "puppyLuv");

        System.out.println(fun.containsValue("intoTheWild1"));

    }
}
