package Practise_by_me;

import java.util.Scanner;

public class BinaryToDecimals {
    // 1 0 1 0 0 0 1 1 ------> 2^0*1+2^1*
    // 7 6 5 4  3 2 1 0
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        int [] binary = new int [8];
        for (int i = 0; i < binary.length; i++){
            binary[i] = input.nextInt();
        }
        int value = 0;
        for (int j= binary.length-1; j>=0; j--) {
            int product = binary [j];
            for (int i = j; i <binary.length-1; i++) {
                product *= 2;
            }
            value+=product;
        }
        System.out.println(value);
    }


}
