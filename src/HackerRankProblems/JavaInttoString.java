package HackerRankProblems;

import java.util.Scanner;

public class JavaInttoString {
    public static void main(String[] args) {
       try{
           Scanner scan = new Scanner(System.in);
           int n = scan.nextInt();
           scan.close();
           String s = String.valueOf(n);

           if (n == Integer.parseInt(s)){
               System.out.println("Good job");
           }else{
               System.out.println("Wrong answer");
           }
       } catch(Exception e){
           System.out.println("Unsuccessful Termination");
        }
    }
}
