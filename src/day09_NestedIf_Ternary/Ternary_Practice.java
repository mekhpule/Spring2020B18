package day09_NestedIf_Ternary;

public class Ternary_Practice {

    public static void main(String[] args) {

        byte score = 87;
        String grade = "";
        if (score >= 90 && score <= 100) {
            grade = "Excellent";
        } else if (score >= 80 && score < 90) {
            grade = "Great";
        } else if (score >= 70 && score <80) {
            grade = "Good";
        } else if (score >= 60 && score < 70){
        grade = "Pass"; }
        else if (score < 60 && score > 0) {
             grade = "Failed";}
        else { // if score is less than 0 or greater than 100
            grade = "Invalid";}
        System.out.println(grade);

        String grade2 = (score>= 90 && score<= 100) ? "Excellent" : (score>= 80 && score < 90) ? "Great"
                :(score >= 70 && score < 80) ? "Good" :(score >= 60 && score <70) ? "Pass"
                :( score < 60 && score >0)? "Failed" : "Invalid" ;

        System.out.println(grade2);

    }
}
