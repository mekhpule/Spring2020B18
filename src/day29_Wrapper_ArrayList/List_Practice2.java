package day29_Wrapper_ArrayList;

import Resources.Library;

import java.util.ArrayList;

/*
       1. create a list of Integers
       2. add 5 Integers to it
       3. return the maximum number from the list
               Do not use any sorting
        */
public class List_Practice2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(20);
        list.add(300);
        list.add(400);
        list.add(50);

        int maximum = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) > maximum) {
                maximum = list.get(i);
            }
        }

        System.out.println(maximum);


        ArrayList<Integer>  list2 = new ArrayList<>();
        list2.add(5000);
        list2.add(200);
        list2.add(300);

        int maximum3 = Library.max(list2);
        System.out.println(maximum3);


    }


    public static int max(ArrayList<Integer> list){
        int maximum = Integer.MIN_VALUE;
        for(int i = 0; i < list.size(); i++){

            if(list.get(i) > maximum ){
                maximum = list.get(i);
            }

        }

        return maximum;

            }

        }



