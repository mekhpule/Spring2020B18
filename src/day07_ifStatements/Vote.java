package day07_ifStatements;

public class Vote {

    public static void main(String[] args) {
        int age = 19;
        boolean citizen = true;
        boolean likeDonald = false;

        boolean eligible = age >= 18 && citizen == true;

        if (eligible) {
            System.out.println(" You are eligible to vote");
        }

        if (!eligible) {
            System.out.println(" You are not eligible to vote");
        }


    }
}
