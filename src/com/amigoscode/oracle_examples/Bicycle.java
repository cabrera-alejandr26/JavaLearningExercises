package com.amigoscode.oracle_examples;

public class Bicycle {
    int cadence = 0;
    int speed = 0;
    int gear = 1;

   public void changeCadence(int newValue){
       cadence = newValue;
    }

    void changeGear(int newValue){
        gear = newValue;
    }

    public void  speedUp(int increment){
        speed = speed + increment;
    }

    void applyBreaks(int decrement){
        speed = speed - decrement;
    }

    void printStates(){
        System.out.println("cadence: " +
                cadence + " speed: " +
                speed + " gear: " + gear);
    }
}
