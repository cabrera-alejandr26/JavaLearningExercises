package HackerRankProblems;

import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//Initialize Scanner
        int counter = 1;//Initialize a counter starting at one.

        //Create a while loop
        //A while loop executes the body of the loop as long as the loop condition evaluates to true.
        //The condition will be evaluated before the body of the loop executes, and after the body of loop finishes.
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            System.out.println(counter + " " + line);//Counter concatenate the read line.
            counter++; //Add one to the counter for every loop.
        }
    }
}
