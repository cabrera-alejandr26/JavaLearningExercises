package com.amigoscode.JavaII;

import java.sql.SQLOutput;

public class ServerNameGenerator {
    public static void randomName(String[] array1, String[] array2){
        int min = 0;
        int max = 10;

        for(int i = min; i <= min; i++){
            int getRandomValue1 = (int) (Math.random()*max); //Substituting * max with * array.length will work as well!
            int getRandomValue2 = (int) (Math.random()*max);
            System.out.println("These are the two random numbers:");
            System.out.println(getRandomValue1);
            System.out.println(getRandomValue2);
            System.out.println("------------------------");

            System.out.println("Here is your server name: ");
            System.out.println(array1[getRandomValue1] + "-" + array2[getRandomValue2]);
        }
    }



    public static void main(String[] args) {
        String[] adjectives = {"foolish","fresh","high","salty","precious","charming","dull","elegant","brave","silky"};
        String[] Nouns = {"cowboy","foot","london","doll","bucket","park","cheese","bear","jelly","tiger"};

        randomName(adjectives, Nouns);
    }
}
