public class ArrayWithMixedLetters {
    public static void main(String[] args) {
        char selectedLetter = 'q';
        char[] mixedLetters = {'a', 'g', 'h', 't', 'u', 'p', 'x', 'q', 'j',};
        int i = 0, counter = 0;
        while (i < mixedLetters.length - 1) {
            i++;
            counter++;
            if (mixedLetters[i] == selectedLetter) {
                System.out.println("Index number in array for selected letter " + selectedLetter + " is " + counter);
                break;
            }
        }
        if (mixedLetters[i] != selectedLetter) {
            System.out.println("There is no letter " + selectedLetter + " in this array");
        }
    }
}
