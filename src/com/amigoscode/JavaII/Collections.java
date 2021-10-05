package com.amigoscode.JavaII;


import java.util.ArrayList;

public class Collections {
    public static void main(String[] args) {
        String[] fruits = new String[3];
        fruits[0] = "Mango";
        fruits[1] = "Apple";
        fruits[2] = "Strawberry";
        System.out.println(fruits[1]);

        ArrayList<String> fruitList = new ArrayList<>();
        fruitList.add("Pear");
        fruitList.add("Mango");
        fruitList.add("Banana");
        fruitList.remove("Pear");


        System.out.println(fruitList);
        System.out.println(fruitList.size());
        System.out.println(fruitList.get(1));

        ArrayList<String> roasts = new ArrayList<>();
        roasts.add("light");
        roasts.add("medium");
        roasts.add("dark");

        System.out.println(roasts);
        System.out.println(roasts.contains("medium"));
        System.out.println(roasts.contains("black"));
    }
}
