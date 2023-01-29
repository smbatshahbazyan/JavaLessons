package OldHomeworks;

public class LargerThanPrevious {
    public static void main(String[] args) {
        int[] arr1 = {4, 9, 8, 7, 2, 6, 8, 4, 5, 2, 3};
        int counter = 0;
        for (int i = arr1.length - 1; i > 0; i--) {
            if (arr1[i] > arr1[i - 1]) {
                counter++;
            }
        }
        System.out.println("Quantity of numbers that are bigger than previous one equal to " + counter);
    }
}
