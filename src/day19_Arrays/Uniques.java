package day19_Arrays;

import java.util.Scanner;

/*
1. write a program that can return the unique characters from a string
		Ex:  "AABCC" ==> "B"
 */
public class Uniques {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a word");
        String str = input.next();

        String result = ""; //"B", to store the unique characters, "unique" accurate only once

        for(int  j = 0; j <= str.length()-1; j++ ){

            int count = 0; // to count the accuracy of the character

            for(int i=0; i <= str.length()-1; i++){
                if(str.charAt(i) == str.charAt(j)){ // to check how many times the character is accrued in the string
                    count++;
                }
            }
            if(count == 1){  // if the character at index j is unique, will be concated to the result
                result+= str.charAt(j);
            }

        }

        System.out.println(result);



    }



}
