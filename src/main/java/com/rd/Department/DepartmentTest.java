package com.rd.Department;


public class DepartmentTest {
    public static void main(String[] args) {

        Department SoftwareDepartment = new Department();
        Department QADepartment = new Department();

        SoftwareDepartment.gender = "Female";
        SoftwareDepartment.job = "Software Engineering";
        SoftwareDepartment.experienceYear = 5;
        SoftwareDepartment.BodyCount = 27;

        QADepartment.gender = "Male";
        QADepartment.job = "Software Test Engineering";
        QADepartment.experienceYear = 3;
        QADepartment.BodyCount = 18;

        SoftwareDepartment.work();
        SoftwareDepartment.promote();
        SoftwareDepartment.addPersonnel(35);

        System.out.println("-------------------------------");

        QADepartment.work();
        QADepartment.promote();
        QADepartment.addPersonnel(30);

        System.out.println("-------------------------------");

        System.out.println("New Software Engineering Department counts are " + SoftwareDepartment.BodyCount);
        System.out.println("-------------------------------");
        System.out.println("New QA Department counts are " + QADepartment.BodyCount);






    }
}
