package HomewrokFromClasses.HomeworkSportsman;

public class Main {
    public static void main(String[] args) {
        int objectNumber = 1;
        Sportsman sportsman1 = new Sportsman(50, 60, 70, 80);
        Sportsman sportsman2 = new Sportsman(60, 70, 90, 80);
        Sportsman sportsman3 = new Sportsman(100, 55, 99, 60);
        Sportsman sportsman4 = new Sportsman(100, 55, 99, 90);
        Sportsman[] arr = {sportsman1, sportsman2, sportsman3, sportsman4};
        for(int i = 0; i < arr.length;i++) {
        System.out.println("Score average for sportsman" + objectNumber + " is " + arr[i].scoreAverage());
        objectNumber++;
        }
//        Comparison for sportsman1 and sportsman2
        sportsman1.comparisonSportsman(sportsman1.scoreAverage(),sportsman2.scoreAverage());
    }
}


