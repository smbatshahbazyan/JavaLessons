import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 3 values with which it is possible to get a triangle");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            System.out.println("It is possible to get a triangle with the entered values");
        } else System.out.println("It isn't possible to get a triangle with the entered values");
    }
}
