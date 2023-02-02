package HomeworkFromMethods;

import java.util.Scanner;

public class CheckArmstrong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input number to check is this number armstrong or not? ");
        int number = s.nextInt();
        if (IsArmstrong(number)) {
            System.out.println("This number is armstrong");
        } else {
            System.out.println("This number isn't armstrong");
        }
    }

    public static boolean IsArmstrong(int number) {
        if (number > 1 && number < 10) {
            return false;
        }
        return number == Armstrong(number);
    }

    public static int Armstrong(int num) {
        int counter = 0;
        int powerNumber = NumberOfDigits(num);
        for (int i = 0; i < powerNumber; i++) {
            counter += Power(num % 10, powerNumber);
            num /= 10;
        }
        return counter;
    }

    public static int Power(int a, int b) {
        int counter = 1;
        for (int i = 1; i <= b; i++) {
            counter *= a;
        }
        return counter;
    }

    public static int NumberOfDigits(int a) {
        int counter = 0;
        for (int i = a; i >= 1; i /= 10) {
            counter++;
        }
        return counter;
    }
}
