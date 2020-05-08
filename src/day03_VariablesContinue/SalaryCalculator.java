package day03_VariablesContinue;

public class SalaryCalculator {

    /*
    warmup task:

     */
    public static void main(String[] args) {
        // DataType variableName=Data;

        double HourlyRate = 65;
        double stateTaxRate = 0.04;
        double federalTaxRate = 0.22;
        byte weeklyHours = 45;
        byte totalWeeks = 52;

        // salary = hourlyRate * weeklyHours* 52

        double salary = HourlyRate * weeklyHours * totalWeeks;
                               //salary before tax
        // stateTax = salary * stateTaxRate

        double stateTax = salary * stateTaxRate;

        //federalTax = salary * federalTaxRate

        double federalTax = salary * federalTaxRate;

        //total Tax = stateTax +

        //salaryAfterTax = salary - stateTax - federalTax;

        double salaryAfterTax = salary - (stateTax + federalTax) ;

        System.out.println("Your salary is:"+ salary); // concatenation
        System.out.println("State tax is:" + stateTax); //concatenation
        System.out.println("Federal Tax is:" + federalTax);
        System.out.println("Total Tax is:" + (federalTax + stateTax) );
        System.out.println("Salary After Tax is:"+ salaryAfterTax);


    /*
        System.out.println("9" + 3 ); // 93, concatenation
        System.out.println(9 + "3"); // 93, concatenation
        System.out.println(9 + 3);// 12, addition

     */
    }
}
