package HomewrokFromClasses.HomeworkSportsman;

public class Sportsman {
    int concursResultAverage;

    Sportsman(int... arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] <= 100) {
                counter += arr[i];
            } else {
                System.out.println("Please enter value from 50 to 100 instead of " + arr[i]);
            }
            concursResultAverage = counter / arr.length;
        }
    }
}
