package HomeworkSinceApril.HomeworkFromCollections.ThirdTask.Monitor;

public class Monitor implements Comparable<Monitor> {
    int diagonalLength;
    double pixels;

    public Monitor(int diagonalLength, double pixels) {
        this.diagonalLength = diagonalLength;
        this.pixels = pixels;
    }

    @Override
    public int compareTo(Monitor T) {
        return Double.compare(T.pixels, this.pixels);
    }
}
