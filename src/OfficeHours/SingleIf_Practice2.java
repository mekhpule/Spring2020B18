package OfficeHours;

public class SingleIf_Practice2 {

    public static void main(String[] args) {

        byte age = 30;
        boolean eligibleToBuy = age > 21 || age == 21;

        if (age >=21) {
            System.out.println("Here is your Vodka");

        }

        if (age < 21) {
            System.out.println("Go drink your milk");
        }

        boolean feelingHappy = false;
        if(feelingHappy){
            System.out.println("don't be sad");
        }

        if(feelingHappy == true){
            System.out.println("Stay happy");
        }



    }

}
