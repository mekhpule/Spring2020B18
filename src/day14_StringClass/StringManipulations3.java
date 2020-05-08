package day14_StringClass;

public class StringManipulations3 {
    public static void main(String[] args) {


        String str1 = "CYBERTEK";
        String str2 = "cybertek";

        System.out.println( str1.equals(str2) ); // false

        System.out.println(str1.equalsIgnoreCase(str2) ); // true, ignores case sensitivity


    }
}
