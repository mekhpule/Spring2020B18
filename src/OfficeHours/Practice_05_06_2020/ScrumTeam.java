package OfficeHours.Practice_05_06_2020;

import java.util.ArrayList;

public class ScrumTeam {

    ArrayList<Tester> testersTeam = new ArrayList<>();
    ArrayList<Developer> devpTeam = new ArrayList<>();

    public void hireTester (Tester tester) {
        testersTeam.add(tester);
    }

    public void fireATester (long id) {
        testersTeam.removeIf(p ->p.employeeId == id);
    }

    public void hireADeveloper (Developer developer) {
        devpTeam.add (developer);
    }

    public void fireADeveloper (long id) {
        devpTeam.removeIf(eachDev ->eachDev.employeeId == id);
    }
}
