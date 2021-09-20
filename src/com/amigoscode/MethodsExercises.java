package com.amigoscode;

public class MethodsExercises {
    public static void main(String[] args) {
        getInteger();
    }
       public static long add(long num1, long num2) {
            return num1 + num2;
        }

        public static long subtract(long num1, long num2) {
            return num1 - num2;
        }

        public static long multiply(long num1, long num2) {
            long sum = 0L;
            for (long i = 1; i<=num2 ; i++) {
                sum += num1;
            }
            return sum;
        }



        public static long divide(long num1, long num2) {
            if (num2 == 0) {
                return 0;
            }
            return num1 / num2;
        }

        //2.
    public static int getInteger(int min, int max) {
        Scanner scan = new Scanner(System.out);
        System.out.println("Enter a number between 1 and 10: ");
        int userInput = scan.nextInt();
        if (userInput < 1 || userInput > 10) {
            System.out.println("Please enter a number between 1 and 10!");
        } else {
            System.out.println("Thank you for your submission!");
            return userInput;
        }
    }


