package Collections.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListDemo {
    public static void arrayListMethods() {
        // Creating a list here
        List<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(3);
        list1.add(null);
        System.out.println("Created a List 1: " + list1);

        // removes element at index i
        list1.remove(3);
        System.out.println("Removed an element from List 1: " + list1);

        list1.add(1, 10);
        System.out.println("Added an element at index 1 in List 1: " + list1);

        list1.get(2);
        System.out.println("Get an element at index 2 in List 1: " + list1.get(2));

        list1.set(1, 100);
        System.out.println("Replace (set value at given index) an element at index 1 in List 1: " + list1);

        // Bulk operations
        Collection<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(3);
        System.out.println("Create a new list2: " + list2);

        list1.removeAll(list2);
        System.out.println("Remove all elements of list1 present in list2 (i.e. 100 and 3): " + list1);

        list2.add(1);
        list1.retainAll(list2);
        System.out.println("Retain all elements of list1 present in list2 (i.e. 1): " + list1);

        list1.addAll(list2);
        System.out.println("Add all elements of list2 in list1: " + list1);

        System.out.println("list1.set(2,2): " + list1.set(2, 2));
        System.out.println("Set element in list1: " + list1);

        // Search
        System.out.println("list1.contains(1): " + list1.contains(1));
        System.out.println("list1.indexOf(1): " + list1.indexOf(1));
        System.out.println("list1.lastIndexOf(1): " + list1.lastIndexOf(1));
        System.out.println("list1: " + list1);

        // Remove
        for (int element : list1) {
            System.out.println("element: " + element);
            // System.out.println(Integer.valueOf(element));
            // if (element == 100) {
            // Gives concurrent modification exception
            // list1.remove(Integer.valueOf(element));
            // }
        }

        System.out.println("New List1: " + list1);
    }
}
