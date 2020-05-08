package OfficeHours.Practice_04_22_2020;

public class Method_Overloading {
    public static void main(String[] args) {
       int num1 = method1(20);
        System.out.println(num1);

    }

    public static void method1(){
        System.out.println("Hello World");
    }

    public static int method1 (int a) {
        System.out.println("Hello Cybertek");
        return 60;
    }

    public static void method1 (int a, int b) {
        System.out.println("Hello Batch 18");
    }
}
