package day16_ForLoop;

public class BreakStatement {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) { // : 1, 2, 3, 4, 5

            System.out.println("Hello World");

            if (i == 3) {
                break;

            }
        }
    }
}
