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
            if (arr[i] < 0) {
                System.out.println("There can't be negative number in this array");
                System.exit(1);
            }
        }
        this.arr = arr;
    }

    public int commonDivisor() {
        int divisor = 1;
        for (int i = 2; i <= arrayMinNumber(); i++) {
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

    int arrayMinNumber() {
        int minNumber = this.arr[0];
        for (int i = 0; i < this.arr.length; i++) {
            if (this.arr[i] < minNumber) {
                minNumber = this.arr[i];
            }
        }
        return minNumber;
    }
}
