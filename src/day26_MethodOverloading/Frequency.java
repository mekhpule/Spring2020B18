package day26_MethodOverloading;

public class Frequency {

    public static void main(String[] args) {
        String str = "AAA";
        char ch = 'A';

        char [] arr = str.toCharArray(); // [A, A, A]

        int count = 0; // 1 + 1 + 1
        for (char each : arr) { // 3
            if (each == ch) {
                count++;
            }

        }
        System.out.println(count);

        String str2 = "AAABCDEFGTHAAAR";
        char ch2 = 'B';
        int num2 = frequency (str2, ch2);
        System.out.println(num2);

    }

    public static int frequency (String str, char ch) { // counts char frequency

        char [] arr = str.toCharArray(); // [A, A, A]

        int count = 0; // 1 + 1 + 1
        for (char each : arr) { // 3
            if (each == ch) {
                count++;
            }
        }
        return count++;

    }
}
