package day37_Constructors;

public class StaticReviews {

    static int a; // 1 copy
    int b; // 2, each object has its own copy of instance variable

    static String name = "John";
           String id = "123";


    public static void main(String[] args) {

        StaticReviews obj1 = new StaticReviews();
        obj1.a = 20;

        obj1.b = 10;

        StaticReviews obj2 = new StaticReviews();
        obj2.a = 30;

        obj2.b = 40;

        System.out.println(obj1.a); // 30
        System.out.println(obj2.a); // 30

        System.out.println(obj1.b); // 10
        System.out.println(obj2); // 40

        System.out.println("========================================================================");



    }
}
