package day23_Methods;

public class Methods {

    /*
   Access-modifer specifier return-type  methodName(){
                   statements;
           }
           step1: Hello Cybertek
           step2: Hello World 5 times
           step3: Hello Btach 18
           step4: Hello World 5 times
           step5: Helle Saim
           step6: Hello World 5 times
    */

    public static void main(String[] args) {
        System.out.println("Hello Cybertek");
        printHello5();
        System.out.println("Hello Batch18");
        printHello5();
        System.out.println("Hello Saim");
        printHello5();

    }

    public static void printHello5() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
    }
}