package HomewrokFromClasses.HomeworkFootballClub;

public class Player {
    private final String name;
    private final String surname;
    private final String position;
    private final String nationality;

    public Player(String name, String surname, String position, String nationality) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.nationality = nationality;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPosition() {
        return position;
    }

    public String getNationality() {
        return nationality;
    }

}
