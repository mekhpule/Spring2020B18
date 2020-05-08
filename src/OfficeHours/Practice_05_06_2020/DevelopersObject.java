package OfficeHours.Practice_05_06_2020;

public class DevelopersObject {

    public static void main(String[] args) {

        Developer developer1 = new Developer();
        developer1.setInfo("John", "Senior Developer", 160_000, 18121993);

        System.out.println(developer1);

        Developer developer2 = new Developer();
        developer2.setInfo("Leon", "Senior Developer", 180_000, 23334568);
        System.out.println(developer2);

        developer1.coding();
        developer2.coding();

        developer1.fixingBug();
        developer2.fixingBug();
        System.out.println("=======================================================");

        Developer[] arr = {developer1, developer2};
/*
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
 */

        for(Developer each  : arr ){
            System.out.println(each);
        }

    }
}
