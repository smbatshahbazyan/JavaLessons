public class LongestArray {
    public static void main(String[] args) {
        int[][] arr1 = {
                {4, 5, 6},
                {1, 2, 3, 7, 4, 6, 8, 2, 8},
                {7, 8, 9, 8},
                {5, 9, 7, 2, 8, 7, 1, 6, 9, 7}
        };
        int longestArray = arr1[0].length;
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i].length > longestArray) {
                longestArray = arr1[i].length;
            }
        }
        System.out.print("The biggest row is ");
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i].length == longestArray) {
                for (int j = 0; j < arr1[i].length; j++) {
                    System.out.print(arr1[i][j] + ", ");
                }
                System.out.println();
            }
        }
    }
}
