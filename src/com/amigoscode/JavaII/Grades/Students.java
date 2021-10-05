package com.amigoscode.JavaII.Grades;

import java.util.ArrayList;

public class Students {
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    //Constructor
    public Students(String name) {
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public void addGrade(int grade){
            grades.add(grade);
    }

    public double getGradeAverage(){
        int total = 0;
        double average = 0;
       for(int i = 0; i < grades.size(); i++){
           total += grades.get(i);
           average = total/grades.size();
       }
       return average;
    }

    public static void main(String[] args) {
        Students student1 = new Students("Arnold");
        student1.addGrade(89);
        student1.addGrade(99);
        student1.addGrade(79);
        System.out.println(student1.getName() + "'s grade average is, " + student1.getGradeAverage());


    }
}
