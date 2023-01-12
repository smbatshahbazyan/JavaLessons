public class ArrayWithMixedNumbers {
    public static void main(String[] args) {
        int[] arr1 = {7, -9, 8, -1, -12, 0, -79, 6};
        int counter = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < 0) {
                arr1[i] = arr1[i] * -1;
                counter++;
            }
        }
        System.out.print("New array with positive number is {");
        for (int a : arr1) {
            System.out.print(" " + a + ",");
        }
        System.out.println("}");
        System.out.println("Count of replaced number is " + counter);
        System.out.println("Count of positive numbers in main array is " + (arr1.length - counter));
    }
}
