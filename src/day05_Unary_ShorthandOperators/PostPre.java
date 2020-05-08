package day05_Unary_ShorthandOperators;

public class PostPre {
    public static void main(String[] args) {

        // Pre: changes the value of the variable immediatly

        int a = 100;
        System.out.println(++a); //a=101
        System.out.println(a); // 101

        int b = 100;
        System.out.println(--b); // 99
        System.out.println(b); // 99

        // Post: first passes the current value, then eventually changes the variable' value

        int A = 100;
        System.out.println(A++); // at line 18, A' values is still 100
        System.out.println(A); // 101

        int B = 100;
        System.out.println(B--); // 100
        System.out.println(B); // 99

          // post & pre examples:
        int Z = 10;
        int X = ++Z; // at line 28, X is increased by 1
        System.out.println(X); // 11
        System.out.println(Z); // 11

        int s = 10;
        int f = s++; // 10, after line 34, the value of s will be increased by 1

        System.out.println(f); // 10'
        System.out.println(s); // 11

        double t1 = 3.5;
        double t2 = t1--; // 3.5, after line 39 t1 will be decreased by 1
        System.out.println(t2); // 3.5
        System.out.println(t1); // 2.5

        int num = 35;
        System.out.println(num++); // 35, after line 44 the value of num will be 36
        System.out.println(num--); // 36,










    }
}
