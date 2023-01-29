package OldHomeworks;

public class Arr1Arr2Arr3 {
    public static void main(String[] args) {
        int[] arr1 = {7, 6, 4, 8, 7, 2, 0, 0};
        int[] arr2 = {5, 7, 8, 9, 7, 8, 2, 1};
        int[] arr3 = new int[arr1.length];
        for (int i = 0; i < arr3.length; ++i) {
            if ((arr1[i] % 2 != 0) && (arr2[i] % 2 != 0)) {
                arr3[i] = arr1[i];
            } else if ((arr1[i] % 2 == 0) && (arr2[i] % 2 == 0)) {
                arr3[i] = arr2[i];
            } else arr3[i] = 0;
        }
        //For-Each method
        System.out.print("Third Array is {");
        for (int i : arr3) {
            System.out.print(" " + i);
        }
        System.out.print(" }");
    }
}
