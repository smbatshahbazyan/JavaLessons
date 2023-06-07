package HomeworkSinceApril.HomeworkFromCollections.ThirdTask.Triangle;

import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String, Triangle> map = new LinkedHashMap<>();

        Triangle triangle1 = new Triangle(new Coordinate(9, 3), new Coordinate(8, -7), new Coordinate(4, 7));
        Triangle triangle2 = new Triangle(new Coordinate(4, 9), new Coordinate(8, 3), new Coordinate(11, 12));

        map.put("Blue", triangle1);
        map.put("Red", triangle2);
        System.out.println("Coordinates for red triangle is " + map.get("Red"));
    }
}
