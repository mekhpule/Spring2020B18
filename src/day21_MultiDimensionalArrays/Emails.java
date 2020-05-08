package day21_MultiDimensionalArrays;

public class Emails {
/*  Task:
    given an array:
        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"}
        elements could be more in the array
    print all the email addresses excluding the gmail addresses
        NOTE: MUST USE FOR EACH LOOP
 */
        public static void main(String[] args) {

            String []emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"};

            for (String EachEmail:emails) {


/*                if (!EachEmail.endsWith ("@gmail.com")) {
                    System.out.println(EachEmail);
                } */

           if (EachEmail.endsWith("@gmail.com")){
               continue;
           }
                System.out.println(EachEmail);
            }


    }
}
