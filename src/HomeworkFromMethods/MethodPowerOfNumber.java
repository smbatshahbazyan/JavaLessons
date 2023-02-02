package HomeworkFromMethods;

import java.util.Scanner;

public class MethodPowerOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please input two integer from -10 to 10 for counting first number power of second number ");
        System.out.println("First number must be positive, For example");
        System.out.println("2^5=" + powerOfNumber(2, 5));
        System.out.println("5^-3=" + powerOfNumber(5, -3));
        System.out.println("Please input two numbers");
        int number1 = s.nextInt();
        int number2 = s.nextInt();
        double powerResult = powerOfNumber(number1, number2);
        if (powerResult == -1) {
            System.out.println("Please input correct numbers, fro-10 to 10");
        } else if (powerResult == -2) {
            System.out.println("First number is negative or zero, please input positive number");
        } else {
            System.out.println("Result " + number1 + "^" + number2 + "=" + powerResult);
        }
    }

    public static double powerOfNumber(int num1, int num2) {
        double counter = 1;
        if (num1 <= 0) {
            counter = -2;
            return counter;
        } else if (num1 > 10 || num2 < -10 || num2 > 10) {
            counter = -1;
            return counter;
        } else {
            for (int i = 1; i <= checkModule(num2); i++) {
                counter *= num1;
            }
        }
        return num2 < 0 ? 1 / counter : counter;
    }

    public static int checkModule(int number) {
        if (number < 0) {
            number *= -1;
        }
        return number;
    }
}
