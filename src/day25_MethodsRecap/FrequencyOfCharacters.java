package day25_MethodsRecap;

import Resources.Library;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        String str = "AABBCC"; // A2B2C2
        String NonDup = Library.RemoveDuplicates (str);  // ABC


        for (int i = 0; i < NonDup.length(); i++) {

            String ch = ""+NonDup.charAt(2); // "A"
            int num = Library.Frequency (str, ch);

            System.out.println(ch+num);


        }

        String ch = ""+NonDup.charAt(2); // "A"
        int num = Library.Frequency (str, ch);

        System.out.println(ch+num);

    }
}
