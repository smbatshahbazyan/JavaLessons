package HomeworkSinceApril.HomeworkGenericClassBox;

public class Box<T extends Number> {
    public T unknown;

    Box(T value) {
        unknown = value;
    }

    static int summary(Box x, Box y) {
        return (x.unknown.intValue() + y.unknown.intValue());
    }
}
