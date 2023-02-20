package HomewrokFromClasses.HomeworkDivisor;

public class Array {
    private int[] arr;

    Array(int[] arr) {
        setArr(arr);
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                System.out.println("There can't be zero in this array");
                System.exit(1);
            }
        }
        this.arr = arr;
    }

    public int commonDivisor() {
        int divisor = 1;
        for (int i = 2; i <= arrayMinNumber(arr); i++) {
            boolean isDividingWithoutRemainder = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] % i != 0) {
                    isDividingWithoutRemainder = true;
                    break;
                }
            }
            if (!isDividingWithoutRemainder) divisor = i;
        }
        return divisor;
    }

    int arrayMinNumber(int[] array) {
        int minNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];
            }
        }
        return minNumber;
    }
}
