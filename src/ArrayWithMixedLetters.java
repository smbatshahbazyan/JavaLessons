import java.util.Scanner;

public class ArrayWithMixedLetters {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your letter");
        char selectedLetter = s.next().charAt(0);
        char[] mixedLetters = {'a', 'g', 'h', 't', 'u', 'p', 'x', 'q', 'j', 'l'};
        int i = 0;
        while (i < mixedLetters.length) {
            if (mixedLetters[i] == selectedLetter) {
                System.out.println("Index number in this array for selected letter " + selectedLetter + " is " + i);
                break;
            }
            i++;
        }
        if (i >= mixedLetters.length) {
            System.out.println("There is no letter " + selectedLetter + " in this array");
        }
    }
}
