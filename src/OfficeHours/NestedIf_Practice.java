package OfficeHours;

public class NestedIf_Practice {

    public static void main(String[] args) {

        byte weekDays = 8;

        boolean validNumber = weekDays > 0 && weekDays < 8;
        String result = "";
        result = "Sunday";
        if (validNumber) {
            if (weekDays == 1) {
                result = "Monday";
            } else if (weekDays == 2) {
                result = "Tuesday";
            } else if (weekDays == 3) {
                result = "Wednesday";
            } else if (weekDays == 4) {
                result = "Thursday";
            } else if (weekDays == 5) {
                result = "Friday";
            } else if (weekDays == 6) {
                result = "Saturday";
            } else if (weekDays == 7) {
                result = "Sunday";
            }
        } else {
            result = "Invalid";
        }





    }






}
