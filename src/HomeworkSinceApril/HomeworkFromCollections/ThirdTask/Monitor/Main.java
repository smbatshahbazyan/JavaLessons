package HomeworkSinceApril.HomeworkFromCollections.ThirdTask.Monitor;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Monitor, String> TVs = new TreeMap<>();

        Monitor monitor1 = new Monitor(32, 7000);
        Monitor monitor2 = new Monitor(27, 6000);
        System.out.println(monitor1.compareTo(monitor2));
        TVs.put(monitor1, " Skyworth-2021");
        TVs.put(monitor2, " Hisense-2022");
        System.out.println(TVs.get(monitor1));
        System.out.println(TVs.get(monitor2));
    }
}
