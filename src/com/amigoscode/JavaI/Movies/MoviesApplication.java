package com.amigoscode.JavaI.Movies;

import com.amigoscode.JavaII.Person;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

import static com.amigoscode.JavaI.Movies.MoviesArray.findAll;

public class MoviesApplication {
//public static MoviesArray[] addMovies(Movie name, Movie category){
//    MoviesArray movieList = new MoviesArray();//From Array
//    MoviesArray[] moreMovies = Arrays.copyOf(movieList.findAll().length + 1);
//}


    public static void movieApp(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello, to view our selection of movie titles,");
        System.out.println("select a number within our options!\n");

        System.out.println("0 - Exit.");
        System.out.println("1 - View All.");
        System.out.println("2 - Animation Category.");
        System.out.println("3 - Horror Category.");
        System.out.println("4 - Sci-Fi Category.");
        System.out.println("5 - Add A Movie.\n");

        System.out.println("Your choice:");
        int userSelection = scan.nextInt();

        System.out.println("\n");

        switch (userSelection){

            case 0:
                System.out.println("Thank you for choosing Movie Box, goodbye!");
              System.exit(0);
                break;
            case 1:
                MoviesArray allMovies = new MoviesArray(); //Created a new instance of the MoviesArray class in order to use it in this class, MoviesApplication class.

                for(Movie titles : allMovies.findAll()){


                    System.out.println("Title: " + titles.getName().toUpperCase());
                    System.out.println("Category: " + titles.getCategory());
                    System.out.println("\n");
                }
                break;
            case 2:
                MoviesArray animationMovies = new MoviesArray();

                for(Movie animate : findAll()){
                    if(animate.getCategory().equals("animated")){
                        System.out.println("Title: " + animate.getName().toUpperCase());
                        System.out.println("Category: " + animate.getCategory());
                        System.out.println("\n");
                    }
                }
                System.out.println("Would you like to do something else? Y/N");
                String userAnswer = scan.next().toUpperCase();
                System.out.println("\n");
                if(userAnswer.equals("Y")){
                    movieApp();//Using Recursion! :D
                }else{
                    System.out.println("Thank you for choosing Movie Box, goodbye!");
                    System.exit(0);//Closing application.
                }
                break;
            case 3:
                MoviesArray horrorMovies = new MoviesArray();

                for(Movie horror : findAll()){
                    if(horror.getCategory().equals("horror")){
                        System.out.println("Title: " + horror.getName().toUpperCase());
                        System.out.println("Category: " + horror.getCategory());
                        System.out.println("\n");
                    }
                }
                System.out.println("Would you like to do something else? Y/N");
                String userAnswer1 = scan.next().toUpperCase();
                System.out.println("\n");
                if(userAnswer1.equals("Y")){
                    movieApp();//Using Recursion! :D
                }else{
                    System.out.println("Thank you for choosing Movie Box, goodbye!");
                    System.exit(0);//Closing application.
                }
                break;
            case 4:
                MoviesArray scifiMovies = new MoviesArray();

                for(Movie sci : findAll()){
                    if(sci.getCategory().equals("scifi")){
                        System.out.println("Title: " + sci.getName().toUpperCase());
                        System.out.println("Category: " + sci.getCategory());
                        System.out.println("\n");
                    }
                }
                System.out.println("Would you like to do something else? Y/N");
                String userAnswer2 = scan.next().toUpperCase();
                System.out.println("\n");
                if(userAnswer2.equals("Y")){
                    movieApp();//Using Recursion! :D
                }else{
                    System.out.println("Thank you for choosing Movie Box, goodbye!");
                    System.exit(0);//Closing application.
                }
                break;
            case 5:
                System.out.println("Please enter movie title and category: ");
                String titleScan = scan.next();
                String categoryScan = scan.next();
                System.out.println("Your input:");
                System.out.println("Title: " + titleScan.toUpperCase() );
                System.out.println("Category: " + categoryScan.toLowerCase());

                //Instantiate MoviesArray!


                Movie newMovie = new Movie(titleScan,categoryScan);//From Movie class
                System.out.println(newMovie.getName());

//




        }
    }
    public static void main(String[] args) {

            movieApp();

        }

}



