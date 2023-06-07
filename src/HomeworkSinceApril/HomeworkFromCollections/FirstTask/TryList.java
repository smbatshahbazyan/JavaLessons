package HomeworkSinceApril.HomeworkFromCollections.FirstTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TryList {
    public static void main(String[] args) {
        //First task
        String[] season1 = {"spring", "summer"};
        String[] season2 = {"autumn", "winter"};
        List<String> ArrayListTest = new ArrayList<>(Arrays.asList(season1));
        List<String> LinkedListTest = new LinkedList<>(Arrays.asList(season1));

        System.out.println("First task");
        System.out.println(ArrayListTest.equals(LinkedListTest));
        LinkedListTest = new LinkedList<>(Arrays.asList(season2));
        System.out.println(ArrayListTest.equals(LinkedListTest));
        System.out.println();
        // Second Task
        Integer[] numbers = {77, 8, 9, 3, 77, 77, 8, 77, 89, 200, 5, 8, 77,};
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(numbers));
        System.out.println("Second task");
        System.out.println(myList);
        for (int i = myList.size() - 1; i > 0; i--) {
            if (myList.get(i).equals(myList.get(0))) {
                myList.remove(i);
            }
        }
        myList.remove(0);
        System.out.println(myList);
        System.out.println();
    }
}
