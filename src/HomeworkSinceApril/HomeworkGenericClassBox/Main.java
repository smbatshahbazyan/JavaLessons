package HomeworkSinceApril.HomeworkGenericClassBox;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(55.3);
        Box box1 = new Box(5.6);
        System.out.println(Box.summary(box, box1));
    }
}
