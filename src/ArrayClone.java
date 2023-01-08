public class ArrayClone {
    public static void main(String[] args) {
        double index0 = -9;
        double index1 = 12;
        double index2 = 5;
        double index3 = -6;
        double index4 = 16;
        double[] firstArray = {index0, index1, index2, index3, index4};
        double[] secondArray = new double[5];
        if (index0 > 0) {
            secondArray[0] = firstArray[0];
        }
        if (index1 > 0) {
            secondArray[1] = firstArray[1];
        }
        if (index2 > 0) {
            secondArray[2] = firstArray[2];
        }
        if (index3 > 0) {
            secondArray[3] = firstArray[3];
        }
        if (index4 > 0) {
            secondArray[4] = firstArray[4];
        }
        //Printing first Array
        System.out.println("Input numbers for first array");
        System.out.println((int) (firstArray[0]));
        System.out.println((int) (firstArray[1]));
        System.out.println((int) (firstArray[2]));
        System.out.println((int) (firstArray[3]));
        System.out.println((int) (firstArray[4]));
        //Printing second Array
        System.out.println("Output numbers for second array");
        System.out.println((int) (secondArray[0]));
        System.out.println((int) (secondArray[1]));
        System.out.println((int) (secondArray[2]));
        System.out.println((int) (secondArray[3]));
        System.out.println((int) (secondArray[4]));
    }
}
