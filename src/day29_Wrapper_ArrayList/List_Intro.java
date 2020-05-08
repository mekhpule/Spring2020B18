package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Intro {

    public static void main(String[] args) {

        // ArrayList < DataType > listName = new ArrayList < DataType > ();

        ArrayList<Integer> scores = new ArrayList<>(); // size: 0
                   // if I add 5 elements, size: 5
                   // remove to elements, size: 3 ==> definition of "dynamic" keep changing

        scores.add(10);  // Autoboxing size: 1
        scores.add(20);  // Autoboxing, size: 2
        scores.add(30);  // size: 3

        System.out.println(scores);

        Integer a1 = scores.get(2); // none

        int a2 = scores.get (2); // unboxing

        double a3 = scores.get (2); // unboxing

        System.out.println(a3);

       // System.out.println(scores.get (100)); // index out of bound

        System.out.println("========================================");


        ArrayList<Integer> scores2 = new ArrayList<>();

        scores2.add(10);  // Autoboxing size: 1
        scores2.add(20);  // Autoboxing, size: 2
        scores2.add(30);
        scores2.add(40);  // Autoboxing size: 1
        scores2.add(200);  // Autoboxing, size: 2
        scores2.add(300);

        Integer b = scores2.get(5); // none


        System.out.println(b);

    }


}
