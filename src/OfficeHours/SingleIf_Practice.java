package OfficeHours;

public class SingleIf_Practice {

    public static void main(String[] args) {
        int a = 100;
        int b = 200;

        boolean aGreater = a > b;
        boolean bGreater = b > a;
        boolean aEqualB = a == b;
        //boolean aEqualB = aGreater == bGreater;


        if (aGreater) {

            System.out.println(a + " is greater number ");
        }

        if (bGreater) {
            System.out.println(b + " is greater number");

        }
        if (aEqualB) {
            System.out.println(a + "is equal" + b);
        }
    }

}
