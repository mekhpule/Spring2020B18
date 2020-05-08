package day14_StringClass;

/* Write a Java method to display the middle character of a string
		a) If the length of the string is even there will be two middle characters.
		b) If the length of the string is odd there will be one middle character.
				Input :
					elephant
				Output:
					The middle character in the string: ph */

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter your word");
        String word = input.next(); // Cyber

        String middleCharacter = ""; // to store the middle characters at the end

        int totalChars = word.length (); // 7
        int middleNumber = totalChars/2; // 7/2 = 3

        if (totalChars % 2 != 0) { // odd numbers
           // middleCharacter += word.charAt (middleNumber);
            middleCharacter = middleCharacter + word.charAt(middleNumber);
        } else { // even number
            middleCharacter = middleCharacter + word.charAt (middleNumber - 1) + word.charAt (middleNumber);
            // any thing we added to a string will return it as string

        }
        System.out.println(middleCharacter);
    }


}
