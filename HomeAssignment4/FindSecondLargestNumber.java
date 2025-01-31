package week4.HomeAssignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		//Declare the array
        int[] array = {3, 2, 11, 4, 6, 7};

        // Create a List and add elements from the array
        List<Integer> numberList = new ArrayList<>();
        for (int num : array) {
            numberList.add(num);
        }

        // Sort the list in ascending order
        Collections.sort(numberList);
        
        //Print the sorted list items
        System.out.println(numberList);

        // Print the second largest number (second from the last)
        if (numberList.size() >= 2) {
            System.out.println("The second largest number is: " + numberList.get(numberList.size() - 2));
        } else {
            System.out.println("The array doesn't have enough elements.");
        }
    }
}