package day13_StringClass;

import java.util.Scanner;

public class ShippingInfo {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter your building number");
        String buildingNum = input.next();

        input.nextLine(); // Enter

        System.out.println("Enter your street address");
        String streetAddress = input.nextLine();

        System.out.println("Enter your city name: ");
        String cityName = input.nextLine();

        System.out.println("Enter your state");
        String stateName = input.nextLine();

        System.out.println("enter your zip code");
        String zipCode = input.nextLine();

        input.nextLine(); // Enter

        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        String result = "Ship To:  "+fullName+"\n\t\t"+buildingNum+" "+streetAddress+"\n\t\t"+cityName+", "+stateName+" "+zipCode;

        System.out.println(result);






    }
}
