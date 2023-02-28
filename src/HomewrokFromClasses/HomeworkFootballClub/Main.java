package HomewrokFromClasses.HomeworkFootballClub;

public class Main {
    public static void main(String[] args) {
        FootballClub realMadrid = new FootballClub();
//        Printing all players info
        for (int i = 0; i < realMadrid.players.length; i++) {
            realMadrid.printInfo(i);
            System.out.println();
        }
    }
}
