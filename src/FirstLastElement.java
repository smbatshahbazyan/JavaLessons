public class FirstLastElement {
    public static void main(String[] args) {
        int arr1[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9, 8},
                {5, 9, 7, 2, 4}
        };
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (j == 0) {
                    System.out.print("For row " + i + " first element is " + arr1[i][j] + ", ");
                }
                if (j == arr1[i].length - 1) {
                    System.out.print("Last element is " + arr1[i][j] + ", ");
                }
            }
            System.out.println();
        }
    }
}
