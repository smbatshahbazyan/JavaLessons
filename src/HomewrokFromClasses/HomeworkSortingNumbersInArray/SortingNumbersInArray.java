package HomewrokFromClasses.HomeworkSortingNumbersInArray;

public class SortingNumbersInArray {
    public static void main(String[] args) {
        int[] arr = {12, -23, 12, 5, -23, 5, -23, 5};
        int replacer;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    replacer = arr[i];
                    arr[i] = arr[j];
                    arr[j] = replacer;
                }
            }
        }
        System.out.print("Array after sorting from small to large` {");
        for (int j : arr) {
            System.out.print(j + ", ");
        }
        System.out.print("}");
    }
}
