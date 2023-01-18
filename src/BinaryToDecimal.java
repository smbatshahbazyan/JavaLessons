public class BinaryToDecimal {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 0, 1};
        int decimal = 0;
        int div = 1;
        System.out.print("Binary number is ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        for (int i = arr.length - 1; i >= 0; i--, div *=2) {
            if (arr[i] == 1) {
                decimal += div;
            }
        }
        System.out.println("\nDecimal number for the specified binary number is " + decimal);
    }
}
