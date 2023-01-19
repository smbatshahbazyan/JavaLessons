public class PrintingPrimeNumbers {
    public static void main(String[] args) {
        int[] arr = {8,9, 49, 9, 9, 6, 9};
        int counter = 0;
        boolean isPrime = true;
        System.out.println("Prime numbers for mentioned array");
        for (int j = 0; j < arr.length; j++) {
            for (int i = 2; i < arr[j] / 2; i++) {
                if (arr[j] % i == 0) {
                    isPrime = false;
                    counter++;
                    break;
                }
                isPrime = true;
            }
            if (isPrime) {
                System.out.println(arr[j]);
            }
        }
        if (counter == arr.length) {
            System.out.println("There is no Prime number");
        }
    }
}
