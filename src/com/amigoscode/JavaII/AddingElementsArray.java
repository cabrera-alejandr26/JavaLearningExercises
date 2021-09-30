package com.amigoscode.JavaII;

import java.util.Arrays;
import java.util.Scanner;

public class AddingElementsArray {
    public static void printWords(String[] words){
        for(int i=0; i <words.length; i++){
            System.out.println((i + 1) + ") " + words[i]);
        }
    }

    //add one additional word to an array
    public static String[] addWords(String[] words){
        //Method 1
        //make a new array with the size you want
//        String[] morewords = new String[words.length +1];//Add one more element but the new element is empty

        //Method 2
         String[] morewords = Arrays.copyOf(words, words.length + 1);

         Scanner in = new Scanner(System.in);
        System.out.println("New Word: ");
        morewords[morewords.length - 1]= in.nextLine();//Adding the new word.

        return morewords;
    }

    public static void main(String[] args) {
        String[] words = {"apple","banana","oranages"};

        printWords(words);

        words = addWords(words);
        printWords(words);
    }
}
