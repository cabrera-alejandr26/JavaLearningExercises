package HackerRankProblems;
import java.lang.reflect.Field;
import java.util.Scanner;

public class JavaDataTypes {
    public static void main(String[] args) {
        /*Java has 8 primitive data types:
         * char
         * boolean
         * byte (8-bit)
         * short (16-bit)
         * int (32-bit)
         * long (64-bit)
         * float
         * double*/

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); //Set to initialize how many times you want the try catch methods to repeat.

        //For loop works with the initial t value
        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE)
                    System.out.println("* byte");
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE)
                    System.out.println("* short");
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE)
                    System.out.println("* int");
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE)
                    System.out.println("* long");
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");


            }
        }
    }
}
