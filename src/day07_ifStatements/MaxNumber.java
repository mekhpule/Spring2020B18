package day07_ifStatements;

public class MaxNumber {

    public static void main(String[] args) {
        double a = 100.5;
        double b = 200.5;
        double c = 300.5;

        boolean aGreater = a > b && a > c;
        boolean bGreater = b > a && b > c;
        boolean cGreater = c > a && c > b;

        if (aGreater) {
            System.out.println(a + " is MaxNumber");
        }

        if (bGreater) {
            System.out.println(b+ " is MaxNumber");
        }

        if (cGreater) {
            System.out.println(c+ " is MaxNumber");
        }

    }


}
