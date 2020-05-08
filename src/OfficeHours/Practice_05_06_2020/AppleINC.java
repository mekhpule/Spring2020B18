package OfficeHours.Practice_05_06_2020;

public class AppleINC {

    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.setInfo("Onur", "Junior Tester", 75000, 1234);

        Tester tester2 = new Tester();
        tester2.setInfo("EltonJohn", "Junior Tester", 75000, 12345);

        Tester tester3 = new Tester();
        tester3.setInfo("Rahman", "SDET", 120000, 1256);

        ScrumTeam scrum1 = new ScrumTeam(); // we can use the ArrayList in ScrumTeam class
        scrum1.hireTester(tester3);
        scrum1.hireTester(tester1);
        scrum1.hireTester(tester2);

        scrum1.fireATester(12345);

        // scrum1.testersTeam // returns the testersTeam ArrayList from scrum1

        for (Tester each : scrum1.testersTeam) {
            System.out.println(each);
        }

        System.out.println("=======================================================================");

        Developer dev1 = new Developer();
        dev1.setInfo("Barzy", "Senior Developer", 220200, 1122337);

        Developer dev2 = new Developer();
        dev2.setInfo("Emrah", "Usta Developer", 100000, 223232);

        scrum1.hireADeveloper(dev1);
        scrum1.hireADeveloper(dev2);

        System.out.println(scrum1.devpTeam.size());

        for (Developer each : scrum1.devpTeam) { // ArrayList of developer in scrum team
            System.out.println(each);
        }

        System.out.println("=============================================================");

        System.out.println("In my scrum team, We have "+scrum1.testersTeam.size()+" testers and "+scrum1.devpTeam.size()+" developers");

        /*
        create scrum2: 4 developers, 2 testers
        create scrum3: 5 developers, 3 testers

        create an Array of Scrum: {scrum1, scrum2, scrum3};
        1. iterator the array
         */




    }
}
