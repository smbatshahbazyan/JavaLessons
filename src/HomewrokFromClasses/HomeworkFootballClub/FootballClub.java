package HomewrokFromClasses.HomeworkFootballClub;

public class FootballClub {
    private String clubName = "Real Madrid";
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
    Player[] players = {player1, player2, player3, player4, player5, player6, player7, player8, player9, player10, player11};

    public Player[] getPlayers() {
        return players;
    }

    public String getClubName() {
        return clubName;
    }

    public void printInfo(int i) {
        System.out.println("Info for mentioned player " + (i + 1));
        System.out.println("Player name - " + players[i].getName());
        System.out.println("Player surname - " + players[i].getSurname());
        System.out.println("Player position - " + players[i].getPosition());
        System.out.println("Player nationality - " + players[i].getNationality());
    }
}
