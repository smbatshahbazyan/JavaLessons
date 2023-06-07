package HomeworkSinceApril.HomeworkFromCollections.SecondTask;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String seasons = "spring summer autumn winter";
        System.out.println(seasons);
        System.out.println(reverseText(seasons));
    }

    static String reverseText(String text) {
        String[] st = split(text);
        for (int i = 0; i < st.length; i++) {
            st[i] = reverse(st[i]);
        }
        return Arrays.toString(st);
    }

    static String[] split(String text) {
        return text.split(" ");
    }

    static String reverse(String text) {
        StringBuilder t = new StringBuilder(text);
        t.reverse();
        return t.toString();
    }
}