import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        System.out.println("Please enter value from 1-12 to know corresponding minutes");
        Scanner s = new Scanner(System.in);
        byte minutes = (byte) s.nextInt();
        if ((minutes > 0) && (minutes <= 12)) {
            System.out.println("For entered value corresponding minutes are " + minutes * 5);
        } else System.out.println("Please input correct value");
    }
}
