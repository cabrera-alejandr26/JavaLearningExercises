package com.amigoscode.JavaII.Grades;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class GradesApplication {
    //GradesApp
    public static void gradesApp(){
        HashMap<String, Students> students = new HashMap<>();
        Students student1 = new Students("Arnold");
        student1.addGrade(98);
        student1.addGrade(88);
        student1.addGrade(95);
        Students student2 = new Students("Marissa");
        student2.addGrade(55);
        student2.addGrade(87);
        student2.addGrade(79);
        Students student3 = new Students("Carla");
        student3.addGrade(89);
        student3.addGrade(99);
        student3.addGrade(83);
        students.put("heyArnold123",student1);
        students.put("jigglyPuffin098",student2);
        students.put("SafariZ0ne",student3);

        String[] studentUser = new String[students.size()];

        System.out.println("Welcome! Here are the usernames of our fellow students:\n");
        for(Entry<String, Students> entry: students.entrySet()){
            System.out.println("-" + entry.getKey());
        }
        System.out.println("\nPlease select a user by typing their username.");
        Scanner scan = new Scanner(System.in);
        String userInput = scan.next();


        if(students.containsKey(userInput)){
            System.out.println("\nHere is " + userInput + "'s information:");
            System.out.println("First Name: " + students.get(userInput).getName());
            System.out.println("Students Grades: " + students.get(userInput).getGradeAverage());
        }
        else{
            System.out.println("Sorry, the user you entered does not exist...");
            System.out.println("Please try again:");
            gradesApp();//Recursion
        }

    }
    public static void main(String[] args) {


    gradesApp();




    }
}
