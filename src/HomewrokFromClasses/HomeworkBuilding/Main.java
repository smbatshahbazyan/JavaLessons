package HomewrokFromClasses.HomeworkBuilding;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Building build1 = new Building(3, new int[]{5, 2, 3, 6}, new int[]{5, 8, 9}, "panel");
        Building build2 = new Building(2, new int[]{4, 6, 8}, new int[]{5, 7, 3}, "monolithic");
        Building build3 = new Building(2, new int[]{1, 2, 3}, new int[]{7, 9}, "panel");
        District avan = new District(5000, build1, build2, build3);
        System.out.print("Garden area for each apartment is ");
        System.out.println(avan.gardenAreaForEachApartment(avan.getGardenArea(), avan.allApartment(build1, build2, build3))+ " square");
    }
}
