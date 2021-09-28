package com.amigoscode.JavaII;

public class OOP {
    public String firstName;
    public String lastName;

    public String sayHello(){
        return String.format("Hello from %s %s!", firstName, lastName);
    }

    public static void main(String[] args) {
        //Instance of class OOP:
        OOP rick = new OOP();

        rick.firstName = "Rick";
        rick.lastName = "Sanchez";

        System.out.println(rick.sayHello());
    }
}
