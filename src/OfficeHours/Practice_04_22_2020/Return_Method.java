package OfficeHours.Practice_04_22_2020;

public class Return_Method {
    public static void main(String[] args) {
        sum(1,2);
        int num1 = sum2(10,20);
        System.out.println(num1);

        System.out.println("================================================");

        String str = "Mcpule" ;

        String reuslt = "";
        for(int i = str.length()-1; i>=0; i--){
            reuslt += str.charAt(i);
        }


        System.out.println(reuslt);

        String name = "level";
        String name2 = reverse(name);

        System.out.println(name2);

        System.out.println( name.equals(name2) );

    }

    public static void sum (int a, int b) {
        System.out.println(a+b);
    }

    public static int sum2 (int a, int b) {
        return (a+b);
    }

    public static String reverse (String str) {
        String reuslt = "";
        for(int i = str.length()-1; i>=0; i--){
            reuslt += str.charAt(i);
        }
        return reuslt;
    }


}

