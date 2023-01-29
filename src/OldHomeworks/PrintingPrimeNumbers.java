package OldHomeworks;

public class PrintingPrimeNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 997, 409, 888, 444, 1, 3, 1};
        int counter = 0;
        int counter1 = 0;
        System.out.println("Prime numbers for mentioned array");
        for (int i = 0; i < arr.length; i++, counter = 0) {
            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                System.out.print(arr[i] + ",");
                counter1++;
            }
        }
        if (counter1 == 0) {
            System.out.println("\nThere is no Prime number");
        }
    }
}
