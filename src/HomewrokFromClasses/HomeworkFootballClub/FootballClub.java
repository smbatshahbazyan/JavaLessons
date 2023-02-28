package HomewrokFromClasses.HomeworkFootballClub;

public class FootballClub {
    private final String clubName = "Real Madrid";
    Player player1 = new Player("Thibaut", "Courtois", "Goalkeeper", "Belgium");
    Player player2 = new Player("Daniel", "Carvajal", "Defender", "Spain");
    Player player3 = new Player("Davit", "Alaba", "Defender", "Austria");
    Player player4 = new Player("Ferland", "Mandy", "Defender", "France");
    Player player5 = new Player("Jesus", "Vallejo ", "Defender", "Spain");
    Player player6 = new Player("Luca", "Modric", "Midfielder", "Croatia");
    Player player7 = new Player("Federico", "Valverde", "Midfielder", "Uruguay");
    Player player8 = new Player("Tony", "Croos", "Midfielder", "Germany");
    Player player9 = new Player("Daniel", "Ceballos", "Midfielder", "Spain");
    Player player10 = new Player("Eden", "Hazard", "Forward", "Belgium");
    Player player11 = new Player("Karim", "Benzema", "Forward", "France");

    public String getClubName() {
        return clubName;
    }
}
