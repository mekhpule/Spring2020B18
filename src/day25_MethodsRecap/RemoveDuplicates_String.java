package day25_MethodsRecap;

public class RemoveDuplicates_String {

    public static void main(String[] args) {

        String str = "ABAB";
        String result = "";   // AB

        for (int i = 0; i < str.length(); i++) { // i <= str.length()-1 the same declaration
            char ch = str.charAt(i); // A
            if (!result.contains("" + ch)) { // we can assign str to str or char to char,
                // in this case we concatenate ""+ch string to char
                result += ch;
            }
        }
        System.out.println(result);

        String str2 = "ABCABCABC";
        String result2 = RemoveDuplicates(str2); // ABC
        System.out.println(result2);

    }

    public static String RemoveDuplicates(String str) {
        String result = "";      //AB

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); //B
            if (!result.contains("" + ch)) {
                result += ch;
            }

        }

        return result;
    }
}






