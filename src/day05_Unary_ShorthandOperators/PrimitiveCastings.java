package day05_Unary_ShorthandOperators;

public class PrimitiveCastings {

    public static void main(String[] args) {
        // implicit casting: done automatically;

        int a = 10;
        long b = a; // implicit casting is done automatically
                    // b = 10L;

        int a1 = 100;
        long b1 = (long) a1; // manually doing the implicit casting

        // int c1 = b1;

     // Explicit casting:
        int Inum = 100;
        byte Bnum = (byte)Inum;

        short Snum = (byte)Inum;

        double Dnum = 5.5;
        // float Fnum = (float) Dnum; // 5.5
        float Fnum = (int) Dnum; // 5.0
        // Fnum = (int) 5.5
        // Fnum = 5;
        // Fnum = 5.0;

        System.out.println(Fnum);

        double D1 = 10.5;
        long L1 = (int)D1;
        System.out.println(L1); // 10

        float F1 = 60.5f;
        int I1 = (int) F1; // prefered
        System.out.println(I1);


        long largeNum = 999999999999L;

        int intNum = (int) largeNum;
        System.out.println(intNum);
        // it gives a different num because 999999999 is out of int' range

        char ch1 = 'a';

        short sh1 = (short) ch1;
        System.out.println(sh1);

        char ch2 = 23456;
        System.out.println(ch2);


        double dbl1 = ch2; // 23456.0

        System.out.println(dbl1);

        int z1 = 10;












    }
}
