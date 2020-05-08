package OfficeHours;

public class LogicalOperators {

    public static void main(String[] args) {

        boolean r1 = " Muhtar" == " Bad Guy"; // false

        System.out.println(r1);

        boolean r3 = 10 >= 9; // true
        System.out.println(r3);

        boolean r4 = !false == !true; // false
        // true == false ==> false

        System.out.println(r4);

        // || : as long one condition is true ==> true

        boolean result1 = 9 != 8 || 9 ==8;
                       // true || false ==> true
        System.out.println(result1);

        boolean result2 = 'a' == 'A' || 'A' == 'b';
                         // false || false ==> false
        System.out.println(result2);

        // && : as long as one condition is false ==> false



    }
}
