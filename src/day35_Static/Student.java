package day35_Static;

public class Student {

    String name;
    int id;
    double gpa;

    static String school = "Cybertek";



    public void setInfo (String name, int id, double gpa){ // if we are using any instance, the method should not be static
        this.name = name;
        this.id = id;
        this.gpa = gpa;

    }

    public static void printSchoolName () {
        System.out.println("School name is "+school);
    }

    public String toString(){
        return "Name: "+name+", School Name"+school+", Id"+id+", GPA"+gpa;


    }


}
