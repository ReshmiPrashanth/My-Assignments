package week4.HomeAssignment4;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionusingList {
	
public static void main(String[] args) {
	// Declare arrays
    int[] a = {3, 2, 11, 4, 6, 7};
    int[] b = {1, 2, 8, 4, 9, 7};

    // Create empty lists
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();

    // Add elements of array 'a' to list1
    for (int i = 0; i < a.length; i++) {
        list1.add(a[i]);
    }

    // Add elements of array 'b' to list2
    for (int i = 0; i < b.length; i++) {
        list2.add(b[i]);
    }

    // Compare both lists and find common elements
    System.out.println("Common elements:");
    for (int i = 0; i < list1.size(); i++) {
        for (int j = 0; j < list2.size(); j++) {
            if (list1.get(i).equals(list2.get(j))) {
                System.out.println(list1.get(i));
            }
        }
    }
}
}

