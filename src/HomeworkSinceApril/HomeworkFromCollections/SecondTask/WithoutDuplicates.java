package HomeworkSinceApril.HomeworkFromCollections.SecondTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class WithoutDuplicates {

    public static void main(String[] args) {
        String[] seasons = {"spring", "summer", "summer", "autumn", "autumn", "winter", "winter", "winter"};
        Collection<String> withDuplicates = new ArrayList<>(Arrays.asList(seasons));
        System.out.println("Collection with duplicates " + withDuplicates);
        Collection<String> withoutDuplicates = new HashSet<>(withDuplicates);
        System.out.println("Collection without duplicates  " + withoutDuplicates);
    }
}