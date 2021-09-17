package ThirtyDaysOfCode;

import java.util.Scanner;

public class Day_Two_Operators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalPercent = 100;



        float priceBefore = scan.nextFloat();
        int tipPercent = scan.nextInt();
        int taxPercent = scan.nextInt();
        scan.close();

        float tip = (priceBefore*tipPercent)/totalPercent;
        float tax = (priceBefore*taxPercent)/totalPercent;
        float totalCost = priceBefore + tip + tax;

        System.out.println(Math.round(totalCost));







    }
}
