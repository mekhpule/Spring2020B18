package day14_StringClass;

import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


   /*
        userName: cybertek
        passWord: cybertekschool
    */

        String validUserName = "cybertek";
        String validPassWord = "cybertekschool";

        System.out.println("Enter your username");

        String inputUsername = input.next();

        System.out.println("Enter your password");

        String inputPassWord = input.next();

        boolean validCredentials = inputUsername.equals(validUserName) && inputPassWord.equals(validPassWord);

        if (validCredentials) {

            System.out.println("Log in successfully");

        } else {

            System.out.println("Invalid credentials");
        }

    }

}

