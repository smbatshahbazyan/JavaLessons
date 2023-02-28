package HomewrokFromClasses.HomeworkFootballClub;

public class Main {
    public static void main(String[] args) {
        FootballClub realMadrid = new FootballClub();
        System.out.println("Football club - " + realMadrid.getClubName());
        System.out.println("First players info");
        System.out.println("Name - " + realMadrid.player1.getName());
        System.out.println("Surname - " + realMadrid.player1.getSurname());
        System.out.println("Position - " + realMadrid.player1.getPosition());
        System.out.println("Nationality - " + realMadrid.player1.getNationality());
    }
}
