package HomeworkSinceApril.HomeworkFromCollections.ThirdTask.Triangle;

public class Triangle {
    Coordinate t1;
    Coordinate t2;
    Coordinate t3;

    public Triangle(Coordinate t1, Coordinate t2, Coordinate t3) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
    }

    @Override
    public String toString() {
        return "( " + t1 + ") " + "( " + t2 + " )" + "( " + t3 + " )";
    }
}
