package OfficeHours.Practice_04_22_2020;

public class Void_Method {
    public static void main(String[] args) {
        print();
        boolean USCitizen = true;
        int age = 21;
        Vote(age, USCitizen);
        EligibleToBuyCig(18);
    }

    public static void print() {
        System.out.println("Hello Batch 18");
    }

    public static void Vote(int age, boolean USCitizen) {
        boolean eligibleToVote = age >= 18 && USCitizen == true;
        if (eligibleToVote) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote yet");
        }
    }
// write a method if a person is eligible to buy cigaretts

    // write a method if a person is eligible to bu cig
    // MUST know: age

    public static void EligibleToBuyCig(int age) {
        if (age > 18) {
            System.out.println("Eligible to buy");
        } else {
            System.out.println("Not eligible to buy");
        }

    }

}


