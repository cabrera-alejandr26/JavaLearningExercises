package HackerRankProblems;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class JavaLoops1 {
    public static void main(String[] args) throws IOException {
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int N = scan.nextInt();

        for(int i = 1; i <= 10; i++ ){
            System.out.printf("%d * %d = %d%n", N, i,N*i );
        }

    }
}
