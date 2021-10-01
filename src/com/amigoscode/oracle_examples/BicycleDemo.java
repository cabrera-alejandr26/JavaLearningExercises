package com.amigoscode.oracle_examples;

public class BicycleDemo extends Bicycle{
    public static void main(String[] args) {
        //Instantiate two objects:
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        //Invoke methods on those objects:
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike2.printStates();

//        bike2.changeCadence(30);
//        bike2.speedUp(10);
//        bike2.changeGear(2);
//        bike2.printStates();
    }
}
