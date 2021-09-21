package com.amigoscode.JavaI;

import java.lang.invoke.SwitchPoint;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ControlStatements_Loops {
    public static void main(String[] args) {
/*
        int caseSwitch = 14;

        switch (caseSwitch){
            case 1:
                System.out.println("Case 1 Executed");
                break;
            case 2:
                System.out.println("Case 2 Executed");
                break;
            case 3:
                System.out.println("Case 3 executed");
                break;
            default:
                System.out.println("No Cases Executed");
                break;
        }

        for(int i = 0; i < 10; i += 1) {
            System.out.println("i is " + i);
        }

        for(int i = 1; i <= 10; i++) { // <--+
            if(i % 2 != 1) { //              |
                continue; // ----------------+
            }
            System.out.println(i);
        }

        */
/*Control Statement Exercises*//*

        //1. Loop Basics
        int i = 5;

        while (i <= 15){
            System.out.println(i ++ );
        }

        //Do While
       int t = 0;
        do{
            System.out.println(t += 2);
        }while(t < 100);

        //for
        for (long v = 2L; v < 1000000; v *= v){
            System.out.println(v);
       }

        //2. FizzBuzz
        int p = 0;
        while(p < 100){
            p++;

            if(p % 3 == 0 && p % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if(p % 5 == 0){
                System.out.println("Buzz");
            }
            else if(p % 3 == 0){
                System.out.println("Fizz");
            }
            else{
                System.out.println(p);
            }
        }

        //3.Display Table of Powers:
        Scanner scan = new Scanner(System.in);
        System.out.println("What number would you like to go up to?\n");
        int userNum = scan.nextInt();
        scan.close();

        System.out.println("Number | Squared | Cubed");
        System.out.println("------ | ------- | -----");
        for(int g = 1; g <= userNum; g++){
            System.out.printf("%-7d| %-8d| %-5d%n", g, g * g, g * g * g);

        }
*/

        //4.Convert given number grades into letter grades.
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello there, please enter your grade below: ");
        int grade = scan.nextInt();
        switch (grade/10) {
            case 9:
                System.out.println("Your grade: " + grade + " is an A.");
                break;
            case 8:
                System.out.println("Your grade: " + grade + " is a B.");
                break;
            case 7:
                System.out.println("Your grade: " + grade + " is a C.");
                break;
            case 6:
                System.out.println("Your grade: " + grade + " is a D.");
                break;
            default:
                System.out.print("Your grade: " + grade + " is an F.");

            }
        }



    }
