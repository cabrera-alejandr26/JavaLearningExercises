package com.amigoscode.JavaII;

import java.util.Arrays;

public class ArraysExercises {

    //Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array.
    // It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.
    public static Person[] addPerson(Person[] array, Person newPerson){
        Person[] people = Arrays.copyOf(array, array.length + 1);
        people[array.length] = newPerson;
        return people;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person();
        people[0].setName("Dorothy");
        people[1] = new Person();
        people[1].setName("Rose");
        people[2] = new Person();
        people[2].setName("Blanche");
        for (Person person: people){
            System.out.println(person.getName());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~");

        //If we were to add a new person this is what we would need to do.
        //Invoke the static method addPerson and insert the chosen parameters.
        Person sophia = new Person();//Creating a new person.
        sophia.setName("Sophia");//Set the String name.
        people = addPerson(people, sophia); //adding instantiated object sophia to the Person[] array.

        //Looping or iterating the updated person array.
        for(Person person : people){
            System.out.println(person.getName());
        }




    }
}
