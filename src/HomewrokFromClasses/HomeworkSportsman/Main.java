package HomewrokFromClasses.HomeworkSportsman;

public class Main {
    public static void main(String[] args) {
        Sportsman sportsman1 = new Sportsman(50, 80, 50);
        Sportsman sportsman2 = new Sportsman(70, 80);
        Sportsman sportsman3 = new Sportsman(90, 80, 50, 70, 80);
        Sportsman sportsman4 = new Sportsman(50, 90, 60, 80);
        Sportsman sportsman5 = new Sportsman(60, 90, 70, 50, 80, 90);
//Printing average of concurs result for each sportsman
        System.out.println(sportsman1.concursResultAverage);
        System.out.println(sportsman2.concursResultAverage);
        System.out.println(sportsman3.concursResultAverage);
        System.out.println(sportsman4.concursResultAverage);
        System.out.println(sportsman5.concursResultAverage);
    }
}
