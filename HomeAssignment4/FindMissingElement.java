package week4.HomeAssignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElement {

	public static void main(String[] args) {
		// Declare the array
        int[] array = {1, 2, 3, 4, 10, 6, 8};

        // Create a List and add elements from the array
        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
        	numberList.add(array[i]);
        }

        // Sort the list using Collections.sort()
        Collections.sort(numberList);
        
      //Print the sorted list items
        System.out.println(numberList);

        // Check for missing elements in the sequence
        System.out.println("Missing numbers:");
        for (int i = 0; i < numberList.size() - 1; i++) {
            int current = numberList.get(i);
            int next = numberList.get(i + 1);

            // Check if there is a gap
            if (next != current + 1) {
                for (int missing = current + 1; missing < next; missing++) {
                    System.out.println(missing);
                }
            }
        }
    }
	}
