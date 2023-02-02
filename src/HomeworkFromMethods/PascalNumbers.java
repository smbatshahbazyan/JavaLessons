package HomeworkFromMethods;

import java.util.Scanner;

public class PascalNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter how many line do you want to print from pascal triangle");
        int num = s.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal(i, j) + ",");
            }
            System.out.println();
        }
    }

    public static long pascal(int a, int b) {
        long pascalFormula;
        pascalFormula = factorial(a) / (factorial(b) * factorial(a - b));
        return pascalFormula;
    }

    public static int factorial(int b) {
        int counter = 1;
        for (int i = 1; i <= b; i++) {
            counter = counter * i;
        }
        return counter;
    }
}
