package day07_ifStatements;

public class If_Else_Statements {

    public static void main(String[] args) {

        int number = -6;

        if (number >= 0) {
            System.out.println( number + " is positive");

        }

        if (number < 0) {
            System.out.println(number + " is negative");

        }

        if (number >= 0) {
            System.out.println( number + " is positive");

        } else {
            System.out.println( number + " is negative");
        }



        boolean evenNum = number % 2 == 0;

        if (evenNum) {

            System.out.println( number + " is even number");
        } else {
            System.out.println(number + " is odd number");

        }

        int age = 30;

        if (age >= 21) {

            System.out.println( "Here is your Vodka");
        }
        else {
            System.out.println( "Go home kid");
        }


        boolean testedPositiveForCorona = true;
        if (testedPositiveForCorona) {
            System.out.println("Buy more toilet paper");
        } else {
            System.out.println("Come to work"); }




    }
}
