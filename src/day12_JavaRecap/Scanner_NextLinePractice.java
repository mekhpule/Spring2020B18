package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_NextLinePractice {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in); // 4740Enter

        // 4740 Stonehaven View, Cumming GA, 30040
        // fullAddress: Building-number Street, city, state zipcode

        System.out.println("Building Number: ");
        int Bnumber = input.nextInt(); // 4740


        System.out.println("Building number is: "+Bnumber);

        input.nextLine(); // used for taking out the Enter from scanner

        System.out.println("Street: ");
        String street= input.nextLine();

        System.out.println("Street is: "+street);

        System.out.println("enter the zip code: ");
        int zipCode = input.nextInt(); // 30040Enter

        input.nextLine(); // take out the Enter

        System.out.println("Enter the city name and state separated by comma and space");

        String cityState = input.nextLine();

        String fullAddress = Bnumber+ " "+street+ ", \n"+ cityState+" "+zipCode;

        System.out.println(fullAddress);

        input.close(); // closes the scanner









    }
}
