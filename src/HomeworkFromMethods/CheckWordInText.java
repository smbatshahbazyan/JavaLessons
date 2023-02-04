package HomeworkFromMethods;

public class CheckWordInText {
    public static void main(String[] args) {
        String text = "Java is a programming language and computing platform, and first released by Sun Microsystems in 1995.";
        String word = "and";
        System.out.println(text);
        System.out.println("Here is random text, Let's check how many time word 'and' repeats in text");
        printResult(result(text, word));
        System.out.println("Let's check how many time word 'string' repeats in text");
        printResult(checkString(text));
    }

    public static int result(String text, String word) {
        int counter = 0;
        String[] b = text.split(" ");
        for (String s : b) {
            if (s.equalsIgnoreCase(word)) {
                counter++;
            }
        }
        if (text.isEmpty() || word.isEmpty()) {
            return -2;
        }
        if (counter == 0) {
            return -1;
        } else {
            return counter;
        }
    }

    public static int checkString(String text) {
        int counter = 0;
        String word = "string";
        String[] b = text.split(" ");
        for (String s : b) {
            if (s.equalsIgnoreCase(word)) {
                counter++;
            }
        }
        if (text.isEmpty()) {
            return -2;
        }
        if (counter == 0) {
            return -1;
        } else {
            return counter;
        }

    }

    public static void printResult(int returnedValue) {
        if (returnedValue == -2) {
            System.out.println("Empty text or word, status code is " + returnedValue);
        }
        if (returnedValue == -1) {
            System.out.println("No circulation, status code is " + returnedValue);
        }
        if (returnedValue > 0) {
            System.out.println("Circulation time is " + returnedValue);
        }
    }

}
