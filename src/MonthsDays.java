import java.util.Scanner;

public class MonthsDays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter month number from 1 to 12, to see quantity of days for this month");
        int d = s.nextInt();
        switch (d) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Month number is " + d + " Quantity of days for this months is " + 31);
                break;
            case 4, 6, 9, 11:
                System.out.println("Month number is " + d + " Quantity of days for this months is " + 30);
                break;
            case 2:
                System.out.println("Month number is " + d + " Quantity of days for this months is " + 28);
                break;
            default:
                System.out.println("Please input correct data (1-12)");


        }

    }
}