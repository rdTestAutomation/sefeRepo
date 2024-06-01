package com.rd.Department;

public class Department {

    String department;
    String description;
    String task;
    String budget;
    Integer BodyCount;

    void work(){
        System.out.println(department +" were worked");
    }

    void remove(int decreasement){
        BodyCount -= decreasement;
        System.out.println(department +" were removed");
    }

    void addPersonnel(int increment){
        BodyCount += increment;
        System.out.println( increment + " employees were added to the " + department);
    }
}
