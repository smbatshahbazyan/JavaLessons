public class ArrayClone {
    public static void main(String[] args) {
        double index0 = -1;
        double index1 = -4;
        double index2 = 7;
        double index3 = -2;
        double index4 = 9;
        double[] firstArray = {index0, index1, index2, index3, index4};
        double[] secondArray = new double[5];
        int indexNumber = 0;
        if (firstArray[0] > 0) {
            secondArray[indexNumber] = firstArray[0];
            indexNumber++;
        }
        if (firstArray[1] > 0) {
            secondArray[indexNumber] = firstArray[1];
            indexNumber++;
        }
        if (firstArray[2] > 0) {
            secondArray[indexNumber] = firstArray[2];
            indexNumber++;
        }
        if (firstArray[3] > 0) {
            secondArray[indexNumber] = firstArray[3];
            indexNumber++;
        }
        if (firstArray[4] > 0) {
            secondArray[indexNumber] = firstArray[4];
            indexNumber++;
        }
        //Printing first Array
        System.out.println("Input - {" + (int) firstArray[0] + "," + (int) firstArray[1] + "," + (int) firstArray[2] + "," + (int) firstArray[3] + "," + (int) firstArray[4] + "}");
        //Printing second Array
        System.out.println("Output -{" + (int) secondArray[0] + "," + (int) secondArray[1] + "," + (int) secondArray[2] + "," + (int) secondArray[3] + "," + (int) secondArray[4] + "}");
    }
}
