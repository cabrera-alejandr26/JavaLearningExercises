package com.amigoscode;

import java.util.Scanner;

public class Console_IO {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String name = "codeup";
        System.out.printf("Hello there, %s. Nice to see you.\n", name);

        String greeting = "Salutations";
        System.out.printf("%s, %s!", greeting, name);

        System.out.println("\nEnter Something: \n");
        String userInput = scan.nextLine();


        System.out.println("You entered: --> \"" + userInput + "\" <--");

        /*EXERCISES: */
        //1.
        double pi = 3.14159;

        System.out.printf("The value of pi is approximately %.3f", pi);
        System.out.println("\n");

        //2.
        System.out.println("Please enter first word: \n");
        String firstWord = scan.next();
        System.out.println("Please enter second word: \n");
        String secondWord = scan.next();
        System.out.println("Please enter third word: \n");
        String thirdWord = scan.next();
        System.out.println("Your three words are: \n");
        System.out.println(firstWord + ",\n");
        System.out.println(secondWord + ",\n");
        System.out.println(thirdWord + ",\n");

        /*CALCULATE THE PERIMETER AND AREA OF CODEUP'S CLASSROOMS*/
        System.out.println("Please enter length dimension in feet: \n");
        int length = scan.nextInt();
        System.out.println("Please enter width dimension in feet: \n");
        int width = scan.nextInt();
        int perimeter = length*2 + width*2;
        int area = length * width;

        System.out.printf("Your length is: %d ft, and width: %d ft \n", length, width);
        System.out.printf("Your perimeter is: %d sqft \n", perimeter);
        System.out.printf("Your area is: %d sqft \n", area);

    }
}
