package com.rd.Department;

public class Department {

    String gender;
    String job;
    Integer experienceYear;
    Integer BodyCount;

    void work(){
        System.out.println(job +" were worked");
    }

    void promote(){
        System.out.println(job +" were promoted");
    }

    void addPersonnel(int increement){
        BodyCount += increement;
        System.out.println( increement + " semployees were added to the " + job + " department");
    }
}
