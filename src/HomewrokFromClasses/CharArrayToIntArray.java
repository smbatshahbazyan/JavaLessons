package HomewrokFromClasses;

public class CharArrayToIntArray {
    public static void main(String[] args) {
        char[] charArr = {'a', 'b', '+'};//You can input any char

        for (int i = 0; i < charArr.length; i++) {
            System.out.print(charArr[i] + " ,");
        }
        System.out.print("\nAscii code for this char element is ` ");
        for (int i = 0; i < getAsciiCode(charArr).length; i++) {
            System.out.print(getAsciiCode(charArr)[i] + ",");
        }
        System.out.print("\nSymbols for this Ascii code is ` ");
        int[] intArr = getAsciiCode(charArr);
        for (int i = 0; i < reverseAsciiCode(intArr).length; i++) {
            System.out.print(reverseAsciiCode(intArr)[i] + " ,");
        }
    }

    public static int[] getAsciiCode(char... char1) {
        int[] arr = new int[char1.length];
        for (int i = 0; i < char1.length; i++) {
            arr[i] = (int) char1[i];
        }
        return arr;
    }

    public static char[] reverseAsciiCode(int... int1) {
        char[] arr = new char[int1.length];
        for (int i = 0; i < int1.length; i++) {
            arr[i] = (char) int1[i];
        }
        return arr;
    }
}
