package HomewrokFromClasses.HomeworkDivisor;

public class Main {
    public static void main(String[] args) {
        String text = "Greatest common divisor for mentioned array is - ";
//Array without zero
        int[] arr = {125, 35, 45, 550};
        Array array1 = new Array(arr);
        System.out.println(text + array1.commonDivisor());
//Array with 0
        int[] arr1 = {6548, 0, 874, 789};
        Array array2 = new Array(arr1);
        System.out.println(text + array2.commonDivisor());
    }
}
