package ThirtyDaysOfCode;

import java.util.Scanner;

public class Day_One_DataTypes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 4;
        double d = 4.0d;
        String s = "HackerRank ";

        int theInteger = scan.nextInt();
        double theDouble = scan.nextDouble();
        scan.nextLine();//Scan next line must be included first on its own.
        String theString = scan.nextLine();
        scan.close();


        System.out.println(i + theInteger);
        System.out.println(d + theDouble);
        System.out.println(s +  theString);





    }
}
