package day12_JavaRecap;

import java.util.Scanner;

public class SalaryCalculator {

    /* ask the user enter salary
       ask user enter full name
       ask the user to enter company name
        ask the user to enter SSN
        ask the user to enter JobTitle

     */

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in); // ENTER

        System.out.println("Enter your salary: ");
        double salary = input.nextDouble(); // 100_000

        input.nextLine(); //Enter

        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("Enter Company Name");
        String companyName = input.nextLine();

        System.out.println("Enter your SSN: ");
        long SSN = input.nextLong();// 1234567Enter

        input.nextLine();

        System.out.println("Enter Job Title");
        String jobTitle = input.nextLine();

        System.out.println("Full name is: "+fullName);
        System.out.println("Job Title is: "+jobTitle);
        System.out.println("Company Name: "+companyName);
        System.out.println("SSN: "+SSN);
        System.out.println("Salary is: $"+salary);





    }




}
