package HomewrokFromClasses.HomeworkSentenceModification;

public class TextModification {
    public static void main(String[] args) {
        String text1 = "barev ape jan";
        System.out.print(reverseText(text1));
    }

    public static String reverseText(String text) {
        String[] oldText = text.split(" ");
        String newText = "";
        for (int i = oldText.length - 1; i >= 0; i--) {
            newText = newText.concat(reverseWord(oldText[i]).concat(" "));
        }
        return newText;
    }

    public static String reverseWord(String word) {
        String[] oldWord = word.split("");
        String newText = "";
        for (int i = oldWord.length - 1; i >= 0; i--) {
            newText = newText.concat(oldWord[i]);
        }
        return newText;
    }
}
