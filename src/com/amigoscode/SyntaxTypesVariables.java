package com.amigoscode;

public class SyntaxTypesVariables {
    public static void main(String[] args) {
        //1.
        int myFavoriteNumber = 9;
        System.out.println(myFavoriteNumber);

        //2.
        String myString = "\nHello, this is Alejandro! \n";
        System.out.println(myString);

        //3.
        myString = "My name is no longer here... \n";
        System.out.println(myString);

        //4.
        //An error will be displayed if myString = 3.14159;

        //5.
        long myNumber;

        //6.
        // A long is required for myNumber = 3.14;

        //7.
        myNumber = 123L;
        myNumber = 123;

        //10.
        int x = 5;
        System.out.println(x++);//This will still be 5
        System.out.println(x);//6 becomes six after souting x again.

        x = 5;
        System.out.println(++x);//x is autoincremented automatically.
        System.out.println(x);//And will stay as six even after souting x again.

        //12.
        /*String theNumberThree = "three";
        Object o = theNumberThree;
        int three = (int) o;

        System.out.println(three);*/

        //13.
        int v = 4;
        v += 5;

        int t = 3;
        int y = 4;
        y -=t;

        System.out.println(y);







    }
}
