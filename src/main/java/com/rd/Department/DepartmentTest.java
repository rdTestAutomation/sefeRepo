package com.rd.Department;


public class DepartmentTest {
    public static void main(String[] args) {

        Department SalesDepartment = new Department();
        Department ManagementDepartment = new Department();


        SalesDepartment.department = "Sales Department";
        SalesDepartment.description = "This department, which is responsible for the promotion and sales of the products and services offered by the business, is among the most important representatives of the direct relationship established with customers.";
        SalesDepartment.task = "The more successful the marketing and sales department, which is responsible for many aspects of the business, from advertising, promotion and campaign analysis processes to sales activities and contracts, the stronger the company's profitability potential becomes.";
        SalesDepartment.budget = "1000$";
        SalesDepartment.BodyCount = 10;


        ManagementDepartment.department = "Management Department";
        ManagementDepartment.description = "It is the department with the strongest responsibilities and powers of the company. The management department, which is at the basis of the decision-making and implementation mechanisms of businesses; It brings together the business owner, partners and senior managers.";
        ManagementDepartment.task = "While the management department is the first-level authority on the general strategy and plans of the business, on financial matters; Has high level responsibility in processes such as budgeting, resource allocation and use.";
        ManagementDepartment.budget = "2500$";
        ManagementDepartment.BodyCount = 5;

        SalesDepartment.work();
        SalesDepartment.remove(2);
        SalesDepartment.addPersonnel(5);

        System.out.println("-------------------------------");

        ManagementDepartment.work();
        ManagementDepartment.remove(3);
        ManagementDepartment.addPersonnel(1);

        System.out.println("-------------------------------");

        System.out.println("New Sales Department counts are " + SalesDepartment.BodyCount);
        System.out.println("-------------------------------");
        System.out.println("New Management Department counts are " + ManagementDepartment.BodyCount);






    }
}
