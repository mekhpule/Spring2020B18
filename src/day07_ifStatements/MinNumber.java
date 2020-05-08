package day07_ifStatements;

public class MinNumber {

    public static void main(String[] args) {

        double a = 100;
        double b = 200;
        double c = 400.5;

        boolean aMin = a < b && a < c;
        boolean bMin = b < a && b < c;
        boolean cMin = c < a && c < b;

        if (aMin) {
            System.out.println(a + " is MinNumber");
        }

        if (bMin) {
            System.out.println(b+ " is MinNumber");
        }

        if (cMin) {
            System.out.println(c+ " is MinNumber");
        }
    }

}
