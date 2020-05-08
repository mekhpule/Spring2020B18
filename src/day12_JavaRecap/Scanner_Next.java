package day12_JavaRecap;
// import PackageName.className

import java.util.Scanner;

public class Scanner_Next {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
             // String str = scan.next();
        // System.out.println(str);
        // 7921 Jones Branch Dr, McLean VA, 22034
        String fullAdress = "";

        System.out.println("Enter the number of the building");
           short Bnumber = input.nextShort();
           fullAdress += Bnumber + " ";

        System.out.println("Enter the Street Name: ");
        String streetName = input.next ();
        fullAdress += streetName+ " ";


        System.out.println( "Enter the type of the road");
        String roadType = input.next();
        fullAdress += roadType+", ";

        System.out.println("Enter city name, state, zipCode");
        String cityName = input.next();
        fullAdress += cityName+ ", ";

        String state = input.next();
        fullAdress += state+ " , ";

        int zipCode = input.nextInt();
        fullAdress += zipCode;

        System.out.println("Address is: " + fullAdress);









    }



}
