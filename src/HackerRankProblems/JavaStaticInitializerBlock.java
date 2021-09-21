package HackerRankProblems;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
    //This problem has to do with static blocks. Please remember how static blocks work!
 static int B;
 static int H ;

 static boolean flag = true;
 //Static blocks will always execute first, the main method will always execute last.
 static{
     Scanner scan = new Scanner(System.in);
     B = scan.nextInt();
     H = scan.nextInt();
     scan.close();

    try{
        if(B <= 0 || H <= 0){
            flag = false;
            throw new Exception("Breadth and height must be positive");
        }
    }
    catch (Exception e){
        System.out.println(e);
        System.exit(0);
    }
 }

    public static void main(String[] args) {
        if(flag){
            int area = B*H;
            System.out.println(area);
        }
    }
}
